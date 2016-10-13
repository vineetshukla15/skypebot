package com.skype.bot;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
	    String token = getAuthToken();
	    String url = "https://apis.skype.com/v3/conversations/";
	    StringBuffer jb = new StringBuffer();
	    String line = null;
	    try {
	      BufferedReader reader = request.getReader();
	      while ((line = reader.readLine()) != null)
	        jb.append(line);
	    } catch (Exception e) { /*report an error*/ }

	    JSONArray jsonArray = (JSONArray) JSONValue.parse(jb.toString());
        JSONObject jsonObject= (JSONObject) jsonArray.get(0);
        url = url + jsonObject.get("from") + "/activities/";

	    System.out.println(url);
	    URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Authorization", "Bearer "+token);
        // For POST only - START
        con.setDoOutput(true);
      //Send request
        JSONObject obj2 = new JSONObject();
        obj2.put("type", "message"+"/"+"text");
        obj2.put("text", "Got the message yahoo");
        DataOutputStream wr = new DataOutputStream (
                    con.getOutputStream ());
        wr.writeBytes (obj2.toString());
        wr.flush ();
        wr.close ();
        System.out.println(obj2.toString());
        // For POST only - END
        int responseCode = con.getResponseCode();
        System.out.println("POST Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer sb = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(sb.toString());
        } else {
            System.out.println("POST request not worked");
        }
	}
	
	public String getAuthToken()
	{
	    String token = "";
	    try{
            URL url = new URL("https://login.microsoftonline.com/common/oauth2/v2.0/token");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            
            conn.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream (
                    conn.getOutputStream ());
            
            wr.writeBytes ("client_id=63220841-561e-4fed-9a3d-5385bfbe3034&client_secret=igoksREW3AVBBaaCYrR41ij&grant_type=client_credentials&scope=https%3A%2F%2Fgraph.microsoft.com%2F.default");
            wr.flush ();
            wr.close ();
            
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));
            StringBuilder sb = new StringBuilder();
            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
                sb.append(output);
            }
            JSONObject jsonObject = (JSONObject) JSONValue.parse(sb.toString());
            token = (String) jsonObject.get("access_token");
            conn.disconnect();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return token;
	}

}
