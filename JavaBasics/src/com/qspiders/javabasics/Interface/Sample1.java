package com.qspiders.javabasics.Interface;

public class Sample1 implements Demo1 {
	
	public void test() {
		
		System.out.println("Inside test() in Class sample1");
		
	}

	@Override
	public void m() {
		System.out.println("Inside m() in Class sample1");
		
	}
}
