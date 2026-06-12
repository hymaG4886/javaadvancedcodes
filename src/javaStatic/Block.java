package javaStatic;

public class Block {
	int number;
static {    //static block	
	System.out.println("its a static block");
	
}
{  //nonstatic block
	System.out.println("its a non static block");

}
public Block(){     // block is a class name and also same as constructor in a java  
	System.out.println("its a constructor");
	
	
}
	public static void main(String[] args) {
		// Block block=new Block(); // 2 way  of object creation  
		// System.out.println(block.number);  access for obj value 
		System.out.println("main method");
		new Block();  //for execute non static and constructor block can create object for the blocks     1 way object creation 

		

	}

}
