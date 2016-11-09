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
			return ChatConstants.JSON_HERC_DEMO;
		}
		
		if (text.equals("Show me products in Rentals category")) {
			return ChatConstants.JSON_AUTOMOTIVE;
		}
		
		if (text.equals("Agriculture")) {
			return ChatConstants.JSON_AGRI_LOL_HORSE_OPTIONS;
		}
				
		if (text.equals("Articulated Boom Lifts")){
			return ChatConstants.JSON_AUTOMOTIVE_AERIAL_ARCTICULATED;
		}
		if (text.equals("Wait, Let me find HR related topics for you")) {
			return ChatConstants.JSONHR;
		}
		
		if (text.equals("Breeding")) {
			return ChatConstants.JSON_AGRI_LOL_HORSE_TYPE;
		}
		
		if (text.equals("Broodmare")) {
			return ChatConstants.JSON_AGRI_LOL_HORSE_BROOM;
		}
		if (text.equals("Open or Early Gestation")) {
			return ChatConstants.JSON_AGRI_LOL_HORSE_FORAGE;
		}
		
		if(text.equals("I have access to quality forage")){
			return ChatConstants.JSON_AGRI_LOL_HORSE_DESC_MARE;
		}
		
		if(text.equals("My horse is an easy keeper")){
			return ChatConstants.JSON_AGRI_LOL_HORSE_BROOM_RECOM;
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
