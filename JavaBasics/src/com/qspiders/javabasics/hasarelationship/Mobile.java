package com.qspiders.javabasics.hasarelationship;

public class Mobile {

	String color = "Silver";
	double length = 4.5;
	String os = "Windows";
	static Battery b1 = new Battery();

	public Mobile(double d, String s) {
	}

	public void charging()

	{
		b1.charge();

	}

}
