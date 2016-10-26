package com.skype.bot;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.skype.parser.DataParser;
import com.skype.util.TempDBUtil;

/**
 * Servlet implementation class HandleIncomingMessages
 */
@WebServlet("/HandleIncomingMessages")
public class HandleIncomingMessages extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HandleIncomingMessages() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// String token = getAuthToken();
		String url = "https://apis.skype.com/v3/conversations/";
		StringBuffer jb = new StringBuffer();
		String line = null;
		String respMessage = null;

		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null)
				jb.append(line);
		} catch (Exception e) { /* report an error */
		}
		/*
		 * JSONArray jsonArray = (JSONArray) JSONValue.parse(jb.toString());
		 * JSONObject jsonObject= (JSONObject) jsonArray.get(0);
		 */

		JSONObject jsonObject = (JSONObject) JSONValue.parse(jb.toString());
		JSONObject jsonObject1 = (JSONObject) jsonObject.get("from");
		String idFrom = jsonObject1.get("id").toString();
		url = url + idFrom + "/activities/";

		// IF user is landing first time
		if (TempDBUtil.isThisFirstTime(idFrom)) {
			respMessage = "Hey <b>" + jsonObject1.get("name")
					+ "</b> May i help you";
			TempDBUtil.storeIdentities(idFrom, jsonObject1.get("name")
					.toString());
		}// If user has active session
		else if (TempDBUtil.isActiveSession(idFrom)) {
			// Add a NLP hook here
			respMessage = "What a lovely day today!";
		}// User is returning
		else {
			respMessage = "Welcome back " + jsonObject1.get("name");
		}

		// TempDBUtil.configToken();
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json");
		String access_token = TempDBUtil.isTokenExpired() ? TempDBUtil
				.getAuthToken() : TempDBUtil.TOKENMAP.get("token");
		con.setRequestProperty("Authorization", "Bearer " + access_token);
		// For POST only - START
		con.setDoOutput(true);
		// Send request
		JSONObject obj2 = new JSONObject();
		obj2.put("type", "message" + "/" + "text");
		obj2.put("text", getBotMessage());

		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(obj2.toString());
		// System.out.println(obj2.toString());
		wr.flush();
		wr.close();
		// For POST only - END
		int responseCode = con.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK || responseCode == 201) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer sb = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				sb.append(inputLine);
			}
			in.close();

			// print result
		} else {
			System.out.println("POST request not worked");
		}
	}

	private String getBotMessage() {
		DataParser dp = new DataParser();
		Bot bot = new Bot("0", dp);
		System.out.println(bot.getMessage());
		return bot.getMessage();
	}
	
}
