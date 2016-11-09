package com.skype.util;


public class ChatConstants {
	
	public static String URL = "https://apis.skype.com/v3/conversations/";
	
	public static final String EXPIRY ="expiry";
	
	public static final String TOKEN ="token";
	
	public static final String APPLICATION_TEMP_URL ="APPURL";
	
	public static final String DATECREATED ="dateCreated";
	
	public static final String APP_CLIENT_ID = "8269e0eb-19c7-4994-8a1c-e88434ffd36e";

	public static final String APP_CLIENT_SECRET = "sc15m9AWzTmun6Ae7M7o4jL";
	
	public static final String DATEFORMAT_DD_MM_YYYY_HMMSS = "dd-MM-yyyy H:mm:ss";
	
	public static final String INTIAL_OPTIONS = "INTIAL_OPTIONS";
	
	public static final String INTIAL_HR = "HROptions";
	
	public static final String INTIAL_PAYROLL = "PayRollOptions";
	
	public static final String WELCOMETEXT = "Welcome, How can i help you";
	
	// Chat Response Constants
	
	public static final String WELCOME ="Welcome";
	public static final String GREETING ="Greetings";
	public static final String MANUFACTURING ="Manufacturing";
	public static final String AGRICULTURE = "Agriculture";
	public static final String ARTICULATED_BOOM_LIFTS = "Articulated Boom Lifts";
	public static final String BREEDING = "Breeding";
	public static final String BROODMARE ="Broodmare";
	public static final String OPENOREARLYGESTATION ="Open or Early Gestation";
	public static final String QUALITYFORAGE ="I have access to quality forage";
	public static final String EASYKEEPER = "My horse is an easy keeper";
	public static final String GOODBYE= "Yes, Show me from start";
	
	
	public static final String JSONHR=
			//"{\"type\":\"message/card.carousel\",\r\n\"summary\":\"Greetings from Tavant Bot\",\r\n\"text\":\"Hope you doing good\",                 \r\n                  \"attachments\": [\r\n                     {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"HR\",\r\n                            \"value\": \"Wait, Let me find HR related topics for you\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Payroll\",\r\n                            \"value\": \"http://www.tavant.com/careers\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Something else!\",\r\n                            \"value\": \"Yeah Sure, What you want to know\"\r\n                          },\r\n                         ]\r\n                    }\r\n                    }\r\n                  ],\r\n    }";	
		"{\"type\":\"message/card.carousel\",\"summary\":\"You may look at below options\",\"text\":\"Here you have choices to ask for\",\"attachments\":[{\"contentType\":\"application/vnd.microsoft.card.hero\",\"content\":{\"title\":\"Choose any of the HR options\",\"subtitle\":\"Tavant Automated help Desk\",\"buttons\":[{\"type\":\"imBack\",\"title\":\"Career\",\"value\":\"http://www.tavant.com/careers\"},{\"type\":\"imBack\",\"title\":\"Training\",\"value\":\"Wait, Let me retrive information for you.\"},{\"type\":\"imBack\",\"title\":\"your own Query\",\"value\":\"How can i help you?\"}]}}]}";
	
	public static final String JSONINITIAL=
	"{\"type\":\"message/card.carousel\",\r\n\"summary\":\"Greetings from Tavant Bot\",\r\n\"text\":\"Hope you doing good\",                 \r\n                  \"attachments\": [\r\n                     {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"HR\",\r\n                            \"value\": \"Wait, Let me find HR related topics for you\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Payroll\",\r\n                            \"value\": \"http://www.tavant.com/careers\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Something else!\",\r\n                            \"value\": \"Yeah Sure, What you want to know\"\r\n                          },\r\n                         ]\r\n                    }\r\n                    }\r\n                  ],\r\n    }";
	
	
	
		
	
	public static final String JSON_DOMAINS =
			"{\r\n\"type\":\"message/card.carousel\",\r\n\"summary\":\"Greetings from AMA\",\r\n\"text\":\"Hope you doing good\",\"attachments\": [{\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\"title\": \"I am AMA, Select your preferred domain to start with?\",\"subtitle\": \"Tavant automated help desk\",                \r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\"title\": \"Manufacturing\",\"value\": \"Manufacturing\"\r\n                          },\r\n\t\t\t\t\t\t  {\r\n                            \"type\": \"imBack\",\"title\": \"BFSI\",\"value\": \"BFSI\"\r\n                          },\r\n\t\t\t\t\t\t  {\r\n                            \"type\": \"imBack\",\"title\": \"Education\",\"value\": \"Education\"\r\n                          },\r\n\t\t\t\t\t\t  {\r\n                            \"type\": \"imBack\",\"title\": \"Agriculture\",\"value\": \"Agriculture\"\r\n                          }\r\n                        ]}\r\n                    }],\r\n\t}";
	
	//JSON Automotive Industry
	
	public static final String JSON_HERC_DEMO =	
			"{\"type\":\"message/card.carousel\", \"summary\":\"Greetings from Tavant Bot\", \"text\":\"Hope you doing good\", \"attachments\": [ { \"contentType\": \"application/vnd.microsoft.card.hero\", \"content\": { \"title\": \"Let's start with a demo of HercRental, Select one of below\",\"subtitle\": \"Tavant Automated help Desk\", \"buttons\": [ { \"type\": \"imBack\",\"title\": \"Rentals\",\"value\": \"Show me products in Rentals category\" }, { \"type\": \"imBack\",\"title\": \"Solutions\",\"value\": \"Show me products in Solution category\" }] }}]}";
			
	public static final String JSON_AUTOMOTIVE =
			"{\"type\":\"message/card.carousel\",\r\n\"summary\":\"You Chosen Aerial \",\r\n\"text\":\"We have below choices in Aerial category\",                 \r\n                  \"attachments\": [\r\n                     {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Please select one of below Aerial equipment to see specification\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/aerial/aerial_new.png\",\r\n                \t\t\t\t\"alt\":\"Aerial\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Articulated Boom Lifts\",\r\n                            \"value\": \"Articulated Boom Lifts\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Compact Crawler Lifts\",\r\n                            \"value\": \"Compact Crawler Lifts, Would you like to see specification?\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Electric Scissor Lifts\",\r\n                            \"value\": \"Electric Scissor Lifts,, Would you like to see specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    },\r\n                    {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Please select one of below Air Compressor & Tools equipments\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/air-compress/AirCompressor_new.png\",\r\n                \t\t\t\t\"alt\":\"Air Compressors\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Compressor\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Filtration\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Tools!\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    },\r\n                    {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Please select one of below Climate Control equipments\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/climate-control/climatecontrol_new.jpg\",\r\n                \t\t\t\t\"alt\":\"Climate Control\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Heaters\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Conditioners\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Movers\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    }\r\n                    \r\n                  ]\r\n    }";
		
	public static final String JSON_AUTOMOTIVE_AERIAL =
	//"{\"type\":\"message/card.carousel\",\r\n\"summary\":\"Greetings from Tavant Bot\",\r\n\"text\":\"Hope you doing good\",                 \r\n                  \"attachments\": [\r\n                     {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/aerial/aerial_new.png\",\r\n                \t\t\t\t\"alt\":\"Aerial\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Articulated Boom Lifts\",\r\n                            \"value\": \"Articulated Boom Lifts\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Compact Crawler Lifts\",\r\n                            \"value\": \"Compact Crawler Lifts, Would you like to see specification?\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Electric Scissor Lifts\",\r\n                            \"value\": \"Electric Scissor Lifts,, Would you like to see specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    },\r\n                    {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/air-compress/AirCompressor_new.png\",\r\n                \t\t\t\t\"alt\":\"Air Compressors\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Compressor\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Filtration\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Tools!\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    },\r\n                    {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/climate-control/climatecontrol_new.jpg\",\r\n                \t\t\t\t\"alt\":\"Climate Control\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Heaters\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Conditioners\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Movers\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    }\r\n                    \r\n                  ]\r\n    }";
	"{\"type\":\"message/card.carousel\", \"summary\":\"Greetings from Tavant Bot\", \"text\":\"Hope you doing good\", \"attachments\": [ { \"contentType\": \"application/vnd.microsoft.card.hero\", \"content\": { \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\", \"subtitle\": \"Tavant Automated help Desk\", \"images\":[ { \"url\":\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuSpb6TdVrpa30efwjcWatoEkNhJlZjN3vmytqOyr0-m70TYU4_g\", \"alt\":\"Aerial\" }], \"buttons\": [ { \"type\": \"imBack\", \"title\": \"Articulated Boom Lifts\", \"value\": \"Articulated Boom Lifts\" }, { \"type\": \"imBack\", \"title\": \"Compact Crawler Lifts\", \"value\": \"Compact Crawler Lifts, Would you like to see specification?\" }, { \"type\": \"imBack\", \"title\": \"Electric Scissor Lifts\", \"value\": \"Electric Scissor Lifts,, Would you like to see specification\" } ] } }, { \"contentType\": \"application/vnd.microsoft.card.hero\", \"content\": { \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\", \"subtitle\": \"Tavant Automated help Desk\", \"images\":[ { \"url\":\"https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQPUSUgbEFAmlOXi7G36DH0P7ckeAQN-0f1NawLXMHE9ba0Lsqi\", \"alt\":\"Air Compressors\" }], \"buttons\": [ { \"type\": \"imBack\", \"title\": \"Air Compressor\", \"value\": \"Choose any of below for detailed specification\" }, { \"type\": \"imBack\", \"title\": \"Air Filtration\", \"value\": \"Choose any of below for detailed specification\" }, { \"type\": \"imBack\", \"title\": \"Air Tools!\", \"value\": \"Choose any of below for detailed specification\" } ] } }, { \"contentType\": \"application/vnd.microsoft.card.hero\", \"content\": { \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\", \"subtitle\": \"Tavant Automated help Desk\", \"images\":[ { \"url\":\"https://www.hercrentals.com/content/dam/herc/home/image/agriculture_select.png\", \"alt\":\"Trucks and Trailers\" }], \"buttons\": [ { \"type\": \"imBack\", \"title\": \"Heaters\", \"value\": \"Choose any of below for detailed specification\" }, { \"type\": \"imBack\", \"title\": \"Air Conditioners\", \"value\": \"Choose any of below for detailed specification\" }, { \"type\": \"imBack\", \"title\": \"Air Movers\", \"value\": \"Choose any of below for detailed specification\" } ] } } ] }";
	public static final String JSON_AUTOMOTIVE_AIRCOMPRESSOR =
			"{\"type\":\"message/card.carousel\",\r\n\"summary\":\"Greetings from Tavant Bot\",\r\n\"text\":\"Hope you doing good\",                 \r\n                  \"attachments\": [\r\n                     {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/aerial/aerial_new.png\",\r\n                \t\t\t\t\"alt\":\"Aerial\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Articulated Boom Lifts\",\r\n                            \"value\": \"Articulated Boom Lifts\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Compact Crawler Lifts\",\r\n                            \"value\": \"Compact Crawler Lifts, Would you like to see specification?\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Electric Scissor Lifts\",\r\n                            \"value\": \"Electric Scissor Lifts,, Would you like to see specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    },\r\n                    {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/air-compress/AirCompressor_new.png\",\r\n                \t\t\t\t\"alt\":\"Air Compressors\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Compressor\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Filtration\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Tools!\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    },\r\n                    {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/climate-control/climatecontrol_new.jpg\",\r\n                \t\t\t\t\"alt\":\"Climate Control\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Heaters\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Conditioners\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Movers\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    }\r\n                    \r\n                  ]\r\n    }";
	
	public static final String JSON_AUTOMOTIVE_CLIMATE_CONTROL =
			"{\"type\":\"message/card.carousel\",\r\n\"summary\":\"Greetings from Tavant Bot\",\r\n\"text\":\"Hope you doing good\",                 \r\n                  \"attachments\": [\r\n                     {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/aerial/aerial_new.png\",\r\n                \t\t\t\t\"alt\":\"Aerial\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Articulated Boom Lifts\",\r\n                            \"value\": \"Articulated Boom Lifts\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Compact Crawler Lifts\",\r\n                            \"value\": \"Compact Crawler Lifts, Would you like to see specification?\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Electric Scissor Lifts\",\r\n                            \"value\": \"Electric Scissor Lifts,, Would you like to see specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    },\r\n                    {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/air-compress/AirCompressor_new.png\",\r\n                \t\t\t\t\"alt\":\"Air Compressors\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Compressor\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Filtration\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Tools!\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    },\r\n                    {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Welcome, Hope you doing really great. Choose any of the options below to proceed with\",\r\n                         \"subtitle\": \"Tavant Automated help Desk\",\r\n                         \"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/climate-control/climatecontrol_new.jpg\",\r\n                \t\t\t\t\"alt\":\"Climate Control\"\r\n        \t\t\t\t }],\r\n                        \"buttons\": [\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Heaters\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                            },\r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Conditioners\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          },\r\n                          \r\n                          {\r\n                            \"type\": \"imBack\",\r\n                            \"title\": \"Air Movers\",\r\n                            \"value\": \"Choose any of below for detailed specification\"\r\n                          }\r\n                         ]\r\n                    }\r\n                    }\r\n                    \r\n                  ]\r\n    }";
			
	
	public static final String JSON_AUTOMOTIVE_AERIAL_ARCTICULATED =
		//"{\"type\":\"message/card.carousel\",\r\n\"summary\":\"Greetings from Tavant Bot\",\r\n\"text\":\"Hope you doing good\",                 \r\n                  \"attachments\": [\r\n                     {\r\n                       \"contentType\": \"application/vnd.microsoft.card.hero\",\r\n                       \"content\": {\r\n                         \"title\": \"Articulated Boom Lifts\",\"subtitle\": \"Tavant Automated help Desk\",\"images\":[\r\n            \t\t\t\t{\r\n                \t\t\t\t\"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/aerial/articulated_lifts.png\",\"alt\":\"Articulated Lifts\"\r\n        \t\t\t\t }],\r\n\t\r\n\t\t\t\t\t\"buttons\": [\r\n          \t\t\t\t\t{\r\n            \t\t\t\t\t\"type\": \"openUrl\",\"title\": \"Price and Specification\",\"value\": \"https://www.hercrentals.com/content/herc/en/rentals/aerial/articulated-boom-lifts.html?a_source=sideNav\"\r\n          \t\t\t\t}]\r\n\t\t\t\t\t\t}}]}";
			"{\"type\":\"message/card.carousel\", \"summary\":\"Greetings from Tavant Bot\", \"text\":\"Hope you doing good\", \"attachments\": [ { \"contentType\": \"application/vnd.microsoft.card.hero\", \"content\": { \"title\": \"Articulated Boom Lifts\",\"subtitle\": \"Tavant Automated help Desk\",\"images\":[ { \"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/herc/aerial/articulated_lifts.png\",\"alt\":\"Articulated Lifts\" }], \"buttons\": [ { \"type\": \"openUrl\",\"title\": \"Articulated Lifts-Price and Specification\",\"value\": \"https://www.hercrentals.com/content/herc/en/rentals/aerial/articulated-boom-lifts.html?a_source=sideNav\" }, { \"type\": \"imBack\",\"title\": \"Explore more manufacturing options\",\"value\": \"Manufacturing\" }, { \"type\": \"imBack\",\"title\": \"Show me from start\",\"value\": \"Yes, Show me from start\" }] }}]}";
	//JSON Agri industry
	public static final String JSON_AGRI_LOL_HORSE_OPTIONS =
	"{ \"type\":\"message/card.carousel\", \"summary\":\"Greetings from AMA\", \"text\":\"Hope you doing good\",\"attachments\": [{ \"contentType\": \"application/vnd.microsoft.card.hero\", \"content\": {\"title\": \"I am AMA, Find the Right Horse Feed?\",\"subtitle\": \"Tavant automated help desk\", \"buttons\": [ { \"type\": \"imBack\",\"title\": \"Breeding\",\"value\": \"Breeding\" }, { \"type\": \"imBack\",\"title\": \"Growing\",\"value\": \"Growing\" }, { \"type\": \"imBack\",\"title\": \"Senior\",\"value\": \"Senior\" }, { \"type\": \"imBack\",\"title\": \"Performance\",\"value\": \"Performance\" } ]}}]}";
	
	public static final String JSON_AGRI_LOL_HORSE_TYPE =
	"{ \"type\":\"message/card.carousel\", \"summary\":\"Greetings from AMA\", \"text\":\"Hope you doing good\",\"attachments\": [{ \"contentType\": \"application/vnd.microsoft.card.hero\", \"content\": {\"title\": \"Is your horse a Broodmare or a Stallion??\",\"subtitle\": \"Tavant automated help desk\", \"images\":[ { \"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/lol/breeding/horsebreeding.png\", \"alt\":\"Horse Breeding\" }], \"buttons\": [ { \"type\": \"imBack\",\"title\": \"Broodmare\",\"value\": \"Broodmare\" }, { \"type\": \"imBack\",\"title\": \"Stallion\",\"value\": \"Stallion\" } ]} }] }";
	
	public static final String JSON_AGRI_LOL_HORSE_BROOM =
	"{ \"type\":\"message/card.carousel\", \"summary\":\"Greetings from AMA\", \"text\":\"Hope you doing good\",\"attachments\": [{ \"contentType\": \"application/vnd.microsoft.card.hero\", \"content\": {\"title\": \"What stage of reproduction is your mare in?\",\"subtitle\": \"Tavant automated help desk\", \"buttons\": [ { \"type\": \"imBack\",\"title\": \"Open or Early Gestation\",\"value\": \"Open or Early Gestation\" }, { \"type\": \"imBack\",\"title\": \"Lactation\",\"value\": \"Lactation\" } ]} }] }";
	
	public static final String JSON_AGRI_LOL_HORSE_FORAGE =
	"{ \"type\":\"message/card.carousel\", \"summary\":\"Greetings from AMA\", \"text\":\"Hope you doing good\",\"attachments\": [{ \"contentType\": \"application/vnd.microsoft.card.hero\", \"content\": {\"title\": \"Which of these best describe your forage situation?\",\"subtitle\": \"Tavant automated help desk\", \"buttons\": [ { \"type\": \"imBack\",\"title\": \"I have access to quality forage\",\"value\": \"I have access to quality forage\" }, { \"type\": \"imBack\",\"title\": \"My horse cannot chew or digest hay\",\"value\": \"My horse cannot chew or digest hay\" } ]} }] }";
	
	public static final String JSON_AGRI_LOL_HORSE_DESC_MARE =
	"{ \"type\":\"message/card.carousel\", \"summary\":\"Greetings from AMA\", \"text\":\"Hope you doing good\",\"attachments\": [{ \"contentType\": \"application/vnd.microsoft.card.hero\", \"content\": {\"title\": \"Which of these best describes your mare?\",\"subtitle\": \"Tavant automated help desk\", \"buttons\": [ { \"type\": \"imBack\",\"title\": \"My horse is an easy keeper\",\"value\": \"My horse is an easy keeper\" }, { \"type\": \"imBack\",\"title\": \"My horse is a hard keeper\",\"value\": \"My horse is a hard keeper\" } ]} }] }";
	
	public static final String JSON_AGRI_LOL_HORSE_BROOM_RECOM =
	"{ \"type\":\"message/card.carousel\", \"summary\":\"Greetings from AMA\", \"text\":\"Hope you doing good\",\"attachments\": [{ \"contentType\": \"application/vnd.microsoft.card.hero\", \"content\": {\"title\": \"Recommended For Your Horse?\",\"subtitle\": \"Tavant automated help desk\", \"images\":[ { \"url\":\""+TempDBUtil.TOKENMAP.get(APPLICATION_TEMP_URL)+"/SkypeBot/images/lol/breeding/EnrichPlus.png\", \"alt\":\"Enrich Plus\u00AE Ration Balancing Feed is Recommended for horses able to maintain body condition on hay and/or pasture alone. This concentrated feed provides the nutrition they need without excess calories.\" }], \"buttons\": [ { \"type\": \"openUrl\",\"title\": \"More About recommended Product \",\"value\": \"https://www.purinamills.com/horse-feed/products/enrich-plus-ration-balancing-feed\" }, { \"type\": \"openUrl\",\"title\": \"We Also Recommend Supplement\",\"value\": \"https://www.purinamills.com/horse-feed/products/amplify-high-fat-supplement\" }, { \"type\": \"imBack\",\"title\": \"Let's start once again\",\"value\": \"Take me to Start\" } ]} }] }";
	
	public static final String JSON_REVISTING_IN_SAME_SESSION = 
		"{\"type\":\"message/card.carousel\",\"summary\":\"Greetings from AMA\",\"text\":\"Hope you doing good\",\"attachments\": [{\n\"contentType\": \"application/vnd.microsoft.card.hero\",\n\"content\": {\"title\": \"Would you like to explore options once more\",\"subtitle\": \"Tavant automated help desk\",                \n\"buttons\": [{\"type\": \"imBack\",\"title\": \"Yes\",\"value\": \"Yes, Show me from start\"}, {\"type\": \"imBack\",\"title\": \"No\",\"value\": \"Bye, Take Care!\" }]} }]}";
}
