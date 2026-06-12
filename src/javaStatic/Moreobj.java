package javaStatic;

public class Moreobj {
	static int number;
	static {    //static block	
		System.out.println("its a static block=3"); //based on given order the blocks will be executed
		  number = 10;
		
	}
	static {    //static block	   can print n number of static blocks. and also first can execute static blocks than execute non static and constructor
		System.out.println("its a static block=1");
		  number = 10;
		
	}
	
	static {    //static block	
		System.out.println("its a static block=2");
		  number = 10;
		
	}
	
	{  //nonstatic block  
		System.out.println("its a non static block");
	}
	public Moreobj(){     // block is a class name and also same as constructor in a java  
		System.out.println("its a constructor");
		
	}

	public static void main(String[] args) {
		System.out.println("main method");
		Moreobj moreobj1=new Moreobj();
		Moreobj moreobj2=new Moreobj();
		Moreobj moreobj3=new Moreobj();
		Moreobj moreobj4=new Moreobj();
		Moreobj moreobj5=new Moreobj();
		
		

		

	}

}
