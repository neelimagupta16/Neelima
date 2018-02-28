package com.qspiders.javabasics.learningobjects;

import java.util.Scanner;

public class Demo1 {
		int a;
		int b;
		static int x=90;
		/*public Demo1(int x,int y)
		{
			a=x;
			b=y;
		}
		*/
		void test()
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter value of a: ");
			a=scn.nextInt();
			System.out.println("Enter value of b: ");
			b=scn.nextInt();
			int c=a+b;
			System.out.println("sum of "+a+" and "+b+" is "+c);
		}
		
		static void disp()
		{
			System.out.println("Inside disp");
		}
		
		public static void main(String[] args) {
			Demo1 d1=new Demo1();
			d1.test();	
			Demo1.disp();
			/*Demo1 d2=new Demo1();	
			d2.test();
			Demo1.disp();*/
			
		}

	}


