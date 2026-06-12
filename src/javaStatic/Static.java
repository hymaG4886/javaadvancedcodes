package javaStatic;

import java.util.Random;

public class Static {
	 static int number;   // create in a  method area  .have only one copy  and also create only one field in a method area

	public static void main(String[] args) {
		Static st1=new Static();
		st1.number= new Random().nextInt();
		
		Static st2=new Static();
		st2.number= new Random().nextInt();
		
		Static st3=new Static();
		st3.number= new Random().nextInt();
		System.out.println(st1.number);   // by using and creating object
		System.out.println(st2.number);
		System.out.println(st3.number);
		
		
		
		
		
		

	}

}
