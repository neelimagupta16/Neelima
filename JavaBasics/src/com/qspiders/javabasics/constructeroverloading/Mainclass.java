package com.qspiders.javabasics.constructeroverloading;

//import com.qspiders.javabasics.constructeroverloading.contructeroverloading.Mobile;

public class Mainclass{
public static void main (String[] args) {
	
	Mobile m1v1=new Mobile(6.5, "IOS");
	
	System.out.println("Size and OS Constructor called value is:" +m1v1.size +m1v1.os);
	
	
	Mobile m2v2=new Mobile(3.5);
	
	System.out.println("Size Constructor called value is:" +m2v2.size); 
	
	Mobile m3v3=new Mobile ("White");
	
	System.out.println("Color Constructor called value is:" +m3v3.color); 
	
	Mobile m4v4=new Mobile("Silver", 6.5);
	
	System.out.println("Color and Size Constructor called value is:" +m4v4.color +m4v4.size); 
	
	
}
}