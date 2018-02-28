package com.qspiders.javabasics.constructeroverloading;

public class Mail2 extends Mail{
	
	static void compose(String to, String subject, String cc){
		
		System.out.println("Message sent with subject copied to.");
			
	}
	public static void main(String[] a) {
		
		Mail.compose("Neelima");
		Mail.compose("Neelima", "resume");
		
	compose("Neelima", "Resume", "Gaurav");
	
}}
