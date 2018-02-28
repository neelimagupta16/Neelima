package com.qspiders.javabasics.constructeroverloading;

//public class contructeroverloading {

	public class Mobile {

		public double size = 4.5;
		public String color = "Black";
		public String os = "IOS";

		public Mobile(double size) {
			this.size = size;

		}

		public Mobile(String color) {
			this.color = color;

		}

		public Mobile(double size, String os)

		{
			this.size = size;
			this.os = os;

		}

		public Mobile(String color, double size)

		{
			this.size = size;
			this.color = color;

		}

	}

//}
