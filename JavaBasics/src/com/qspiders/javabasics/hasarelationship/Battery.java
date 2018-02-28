package com.qspiders.javabasics.hasarelationship;

public class Battery {
	
	int capacity=1400;
	int rembattery=14;
	
	public void charge()
	{
		System.out.print("CHarging.......");
		
	for (int i=rembattery;i<=100; i++)
	
	{
		System.out.println("remaing battery CHarging......."+rembattery);
		
		rembattery++;
			}
		
	}
	

}
