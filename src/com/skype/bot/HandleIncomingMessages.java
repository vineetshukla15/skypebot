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

import com.skype.util.MessageFormatter;
import com.skype.util.TempDBUtil;

/**
 * Servlet implementation class HandleIncomingMessages
 */
@WebServlet("/HandleIncomingMessages")
public class HandleIncomingMessages extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String url = null;

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

		url = "https://apis.skype.com/v3/conversations/";
		StringBuffer jb = new StringBuffer();
		String line = null;
		boolean skip = false;
		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null)
				jb.append(line);
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
		JSONObject jsonObject = (JSONObject) JSONValue.parse(jb.toString());
		JSONObject jsonObject1 = (JSONObject) jsonObject.get("from");
		String id = jsonObject1.get("id").toString();
		System.out.println(jb.toString());
		url = url + id + "/activities/";
		String text = jsonObject.get("text").toString();
		//System.out.println(text);
		// IF user is landing first time
		if (TempDBUtil.isThisFirstTime(id)) {
			text = "Greetings";
			TempDBUtil.storeIdentities(id, jsonObject1.get("name").toString());
			long startTime = System.currentTimeMillis();
			postMessage(text);
			long endTime = System.currentTimeMillis();
			long sTime = endTime - startTime;
			System.out.print("Time taken by servlet Request		: ");
			System.out.println(sTime);
			text = "Welcome";
			// TempDBUtil.storeConversation(jsonObject);
		} else if (text.equals("Lower my monthly payment")) {
			skip = true;
			postMessage(text);
			postMessage("Contact Approval");
			
		} else if (text.equals("Agriculture")) {
			skip = true;
			postMessage("Horse Breeding");
			postMessage(text);
			
		} 
		
		if(!skip) postMessage(text);
		

	}

	private void postMessage(String text) {

		String access_token = TempDBUtil.isTokenExpired() ? TempDBUtil
				.getAuthToken() : TempDBUtil.TOKENMAP.get("token");
		String outMessage = MessageFormatter.getAutomatedResponse(text);
		DataOutputStream wr = null;
		HttpURLConnection con =null;
		try {
			long startTime = System.currentTimeMillis();
			URL obj = new URL(url);
			con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Authorization", "Bearer " + access_token);
			con.setDoOutput(true);

			wr = new DataOutputStream(con.getOutputStream());
			System.out.println(outMessage);
			wr.writeBytes(outMessage);
			wr.flush();
			wr.close();
			long endTime = System.currentTimeMillis();
			long sTime = endTime-startTime;
			System.out.println("Time taken by httpConnection : ");
			System.out.println(sTime);
			int responseCode = con.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK
					|| responseCode == 201) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(
						con.getInputStream()));
				String inputLine;
				StringBuffer sb = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					sb.append(inputLine);
				}
				in.close();
			} else {
				//System.out.println(responseCode + " Did not work");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		finally
		{
		 con.disconnect();
		}
	}

}
