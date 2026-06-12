package javaStatic;

import java.util.Random;

public class Static2 {
    static int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Static2.number= new Random().nextInt();
		Static2.number= new Random().nextInt();
		Static2.number= new Random().nextInt();
		System.out.println(Static2.number);  // its a static  way
		System.out.println(Static2.number);
		
		
	}
	public static void print() {   //these are blocks
		System.out.println("static method");
	}
	public void print2() {
		System.out.println(" non static method");

}
}
