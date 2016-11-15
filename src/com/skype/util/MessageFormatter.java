package com.skype.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MessageFormatter {
	
	
	    
    /**
	 * Generate Automate response and hook to NLP
	 * @param text
	 * @return
	 */
	public static String getAutomatedResponse(String text) {
		
		boolean zipCodePending = false;
		
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
		/**
		 * Mortgage Demo	
		 */
		
		if(text.equals("BFSI")) {			
			return ChatConstants.LOAN_OPTIONS;
		}
		
		if(text.equals("I am looking for Loan Purchase")) {
			return ChatConstants.LOAN_PURCHASE;
		}
		
		if(text.equals("Fixed Rate Mortgage")) {
			return ChatConstants.LOAN_PURCHASE_FIXEDRATE;
		}
		
		if(text.equals("Less than 15 Years") || text.equals("15-30") || text.equals("More than 30")) {
			return ChatConstants.CONTACT_CONFIRMATION;
		}
		
		if(text.equals("Yes, Please contact me")) return ChatConstants.LOAN_CONTACT_SOON;
		
		if(text.equals("Loan Refinance")){
			return ChatConstants.LOAN_REFINANCE;
		}
		
		if(text.equals("I am looking for Loan Refinance")) return ChatConstants.LOAN_REFINANCE ;
		
		if(text.equals("Primary Residence")){
			return ChatConstants.LOAN_REFINANCE_GOAL;
		}
		
		if(text.equals("Lower my monthly payment")) {
			return ChatConstants.CONTACT_APPROVAL_FEWDETAILS ; 
		}
				
//		if(isZipCodeValid(text) && TempDBUtil.isThisFirstTime(id)){
//			zipCodePending =false;
//			return ChatConstants.CONTACT_APPROVAL_FEWDETAILS;
//		}
		
		if(text.equals("Contact Approval")) return ChatConstants.CONTACT_APPROVAL_REFINANCE_FINAL;
		
		if(text.equals("Horse Breeding")) return ChatConstants.AGRI_HORSE;
					
		/**
		 * 
		 */
		
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
   
  
	public static boolean isZipCodeValid(String zipCode) {
		String regex = "^[0-9]{5}(?:-[0-9]{4})?$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(zipCode);
		return matcher.matches();

	}

}
