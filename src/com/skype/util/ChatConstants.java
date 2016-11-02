package com.skype.util;


public class ChatConstants {
	
	public static String URL = "https://apis.skype.com/v3/conversations/";
	
	public static final String EXPIRY ="expiry";
	
	public static final String TOKEN ="token";
	
	public static final String DATECREATED ="dateCreated";
	
	public static final String APP_CLIENT_ID = "8269e0eb-19c7-4994-8a1c-e88434ffd36e";

	public static final String APP_CLIENT_SECRET = "sc15m9AWzTmun6Ae7M7o4jL";
	
	public static final String DATEFORMAT_DD_MM_YYYY_HMMSS = "dd-MM-yyyy H:mm:ss";
	
	public static final String INTIAL_OPTIONS = "INTIAL_OPTIONS";
	
	public static final String INTIAL_HR = "HROptions";
	
	public static final String INTIAL_PAYROLL = "PayRollOptions";
	
	public static final String WELCOMETEXT = "Welcome, How can i help you";
	
	public static final String GREETJSON=
			//"{\"type\":\"message/card.carousel\",\r\n\"summary\":\"Greetings from Tavant Bot\",\r\n\"text\":\"Hope you doing good\",                 \r\n                  \"attachments\": [\r\n                     {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"HR\",\r\n                            \"value\": \"Wait, Let me find HR related topics for you\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Payroll\",\r\n                            \"value\": \"http://www.tavant.com/careers\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Something else!\",\r\n                            \"value\": \"Yeah Sure, What you want to know\"\r\n                          },\r\n                         ]\r\n                    }\r\n                    }\r\n                  ],\r\n    }";
	"{\"type\": \"message/text\",\"text\": \"Greetings from Tavant help desk\"}";
	
	public static final String HRJSON=
			//"{\"type\":\"message/card.carousel\",\r\n\"summary\":\"Greetings from Tavant Bot\",\r\n\"text\":\"Hope you doing good\",                 \r\n                  \"attachments\": [\r\n                     {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"HR\",\r\n                            \"value\": \"Wait, Let me find HR related topics for you\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Payroll\",\r\n                            \"value\": \"http://www.tavant.com/careers\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Something else!\",\r\n                            \"value\": \"Yeah Sure, What you want to know\"\r\n                          },\r\n                         ]\r\n                    }\r\n                    }\r\n                  ],\r\n    }";	
		"{\"type\":\"message/card.carousel\",\"summary\":\"You may look at below options\",\"text\":\"Here you have choices to ask for\",\"attachments\":[{\"contentType\":\"application/vnd.microsoft.card.hero\",\"content\":{\"title\":\"Choose any of the HR options\",\"subtitle\":\"Tavant Automated help Desk\",\"buttons\":[{\"type\":\"imBack\",\"title\":\"Career\",\"value\":\"http://www.tavant.com/careers\"},{\"type\":\"imBack\",\"title\":\"Training\",\"value\":\"Wait, Let me retrive information for you.\"},{\"type\":\"imBack\",\"title\":\"your own Query\",\"value\":\"How can i help you?\"}]}}]}";
	
	public static final String INITIALJSON=
	"{\"type\":\"message/card.carousel\",\r\n\"summary\":\"Greetings from Tavant Bot\",\r\n\"text\":\"Hope you doing good\",                 \r\n                  \"attachments\": [\r\n                     {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"HR\",\r\n                            \"value\": \"Wait, Let me find HR related topics for you\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Payroll\",\r\n                            \"value\": \"http://www.tavant.com/careers\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Something else!\",\r\n                            \"value\": \"Yeah Sure, What you want to know\"\r\n                          },\r\n                         ]\r\n                    }\r\n                    }\r\n                  ],\r\n    }";
	
	
}
