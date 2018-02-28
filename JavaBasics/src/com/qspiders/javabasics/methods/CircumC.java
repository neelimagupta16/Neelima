package com.qspiders.javabasics.methods;

public class CircumC {
	
	static double circumcircle(float r)
	{
		double circum;
		float pi=3.14f;
		
		circum= 2*pi*r;
		
		System.out.println("***********************************************");
		System.out.println("Circumference of circle is: "+circum);
		System.out.println("***********************************************");
		
		return circum;	
	}
	
	static double areatriangle(float b, float h)
	{
		double areaoftriangle;
		
		areaoftriangle= 0.5f*b*h;
		
		System.out.println("***********************************************");
		System.out.println("Area of Triangle is: "+areaoftriangle);
		System.out.println("***********************************************");
		
		return areaoftriangle;	
	}
	public static void main(String[] a)
	
	{
		circumcircle(3.5f);
		areatriangle(2.5f, 4.6f);
				
	}
	
	
		

}
