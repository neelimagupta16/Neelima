package com.qspiders.javabasics.learningblocks;

	
	import java.util.Scanner;

	public class Sample {
		int a;
		static int b;
		
		static
		{
			System.out.println("Inside static");
			Scanner scn=new Scanner(System.in);
			System.out.println("enter b value :");
			b=scn.nextInt();
		}
		
		
		static
		{
			System.out.println("");
		}
		
		
		{
			System.out.println("Inside non-static");
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a value :");
			a=scn.nextInt();
		}
		
		public static void main(String[] args) {
			System.out.println("Main Started");
			Sample s1=new Sample();
			Sample s2=new Sample();
			System.out.println("Main Ended");
		}
		static
		{
			
		}

	}



