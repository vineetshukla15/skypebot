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

import org.eclipse.jdt.internal.compiler.impl.CharConstant;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.skype.util.ChatConstants;
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

		String url = "https://apis.skype.com/v3/conversations/";
		StringBuffer jb = new StringBuffer();
		String line = null;

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
		String id = jsonObject1.get("id").toString();
		url = url + id + "/activities/";
		String text = jsonObject.get("text").toString();
		System.out.println(text);
		// IF user is landing first time
		if (TempDBUtil.isThisFirstTime(id)) {
			text = "Welcome";
			TempDBUtil.storeIdentities(id, jsonObject1.get("name").toString());			
			// TempDBUtil.storeConversation(id,guestText);
		}
		
		//postMessage(text);
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json");
		String access_token = TempDBUtil.isTokenExpired() ? TempDBUtil
				.getAuthToken() : TempDBUtil.TOKENMAP.get("token");
		con.setRequestProperty("Authorization", "Bearer " + access_token);
		con.setDoOutput(true);	
		String outMessage = getAutomatedResponse(text);
		System.out.println(outMessage);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(outMessage);
		wr.flush();
		wr.close();
		
				
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

			
		}
		else{
			System.out.println(responseCode+" Did not work");
		}
		
	}
	/**
	 * Generate Automate response and hook to NLP
	 * @param text
	 * @return
	 */
	private String getAutomatedResponse(String text) {

		
		if (text.equals("Welcome")) {
			return ChatConstants.INITIALJSON;
		}
		
		if (text.equals("Wait, Let me find HR related topics for you")) {
			return ChatConstants.HRJSON;
		}
		
		return ChatConstants.GREETJSON;

	}
	
	
}
