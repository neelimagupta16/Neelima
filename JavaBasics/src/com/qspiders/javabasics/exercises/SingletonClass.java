package com.qspiders.javabasics.exercises;

public class SingletonClass {

	int x;
	
	private SingletonClass(int y)
	
	{
		this.x=y;
		
		//private SingletonClass getinstance();
		
		
	}
	
	public static void main(String[] a)
	{
		
	SingletonClass s1=new SingletonClass(5);
	
	System.out.println(s1.x);
		
	}
	
	
}
