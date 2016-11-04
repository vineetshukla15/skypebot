package com.skype.util;


public class MessageFormatter {
	
	
	    
    /**
	 * Generate Automate response and hook to NLP
	 * @param text
	 * @return
	 */
	public static String getAutomatedResponse(String text) {

		
		if (text.equals("Welcome")) {
			return ChatConstants.JSON_DOMAINS;
		}
		
		if (text.equals("Greetings")) {
			return getGreetingJSON();
		}
		
		if (text.equals("Manufacturing")) {
			return ChatConstants.JSON_AUTOMOTIVE;
		}
		
		if (text.equals("Manufacturing")) {
			return ChatConstants.JSON_AUTOMOTIVE;
		}
		if (text.equals("Articulated Boom Lifts")){
			return ChatConstants.JSON_AUTOMOTIVE_AERIAL_ARCTICULATED;
		}
		if (text.equals("Wait, Let me find HR related topics for you")) {
			return ChatConstants.JSONHR;
		}
		
		if (text.equals("Yes, Show me from start")) {
			return ChatConstants.JSON_DOMAINS;
		}
		
		if (text.equals("Bye, Take Care!")) {
			return "";
		}
		
		return getJSONForReturning();
	}
	
	
	private static String getJSONForReturning(){
				return ChatConstants.JSON_REVISTING_IN_SAME_SESSION;
	}
	
	
    public static String getJSONForNoAnswer(){
    	
    	StringBuffer jsonGreet= new StringBuffer();
    	
    	jsonGreet.append("{\"type\": \"message/text\",\"text\": \"");
    	jsonGreet.append(new InteractiveMessageUtil().anyItemForNo()+"\"}");
    	return jsonGreet.toString();
    }
    
    public static String getGreetingJSON(){
    	
    	StringBuffer jsonGreet= new StringBuffer();
    	
    	jsonGreet.append("{\"type\": \"message/text\",\"text\": \"");
    	jsonGreet.append(new InteractiveMessageUtil().anyItemToGreet()+"\"}");
    	return jsonGreet.toString();
    }
    
    
	

}
