package com.qspiders.javabasics.learningobjects;

public class Mobile {
	
		double size;
		String color;
		long number;
		String os="ios";
		
		Mobile(double size,String color)
		{
			this.size=size;
			this.color=color;
		}
		
		void call(long number)
		{
			System.out.println("Calling..."+number);
			this.number=number;
		}
		void music(String song)
		{
			System.out.println("Playing..."+song);
		}
		void callMusic(long number,String song)
		{
			System.out.println("Now playing "+song+" and calling "+number+"....");
		}
	}


