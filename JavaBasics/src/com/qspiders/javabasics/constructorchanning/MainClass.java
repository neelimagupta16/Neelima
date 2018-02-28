package com.qspiders.javabasics.constructorchanning;

public class MainClass {

	public static void main(String[] args) {
		
		Sample2 s2= new Sample2 (10,20);
		
		Sample3 s3= new Sample3();
		
		System.out.println("Value of Sample1 variables is: " +s2.i +s2.j);
		
		System.out.println("Value of Sample2 variables is: " +s2.x +s2.y);
		
		System.out.println("Value of Sample2 variables is: " +s3.x +s3.y);
	}
	
	
	
}
