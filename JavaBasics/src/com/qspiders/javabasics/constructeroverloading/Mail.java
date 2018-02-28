package com.qspiders.javabasics.constructeroverloading;

//public class Methodoverloading {
	
	public class Mail{
		
		static void compose(String to)	{
			
		System.out.println("Message is sent.");
			
		}	
		
		static void compose(String to, String subject){
			
		System.out.println("Message with subject is sent.");
			
		}	
		
		
		public static void main(String[] arg) {
			
			compose("Gaurav");
			
			compose("Neelima", "Resume");
			
			//compose("Neelima", "Resume", "Gaurav");			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
