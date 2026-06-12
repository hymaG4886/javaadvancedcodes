package filehandling;
import java.io.*;

import java.io.FileInputStream;

class Cricketer1 implements Serializable
{
	String name;
	String country;
	int runs;
	int wickets;
	int matches; 
	public Cricketer1(String name,String country,int runs,int wickets,int matches){
		super();
		this.name=name;
		this.country=country;
		this .runs=runs;
		this.wickets=wickets;
		this.matches=matches;	
	}
	void display() {
		System.out.println("name="+name);
		System.out.println("Country= "+country);
		System.out.println("Total runs= "+runs);
		System.out.println("MOst wickets="+wickets);
		System.out.println("Total matches = "+matches);
	}
	public class FileProgram7Deserial {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		String p1="C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\Cricketer1";
		FileInputStream fis=new  FileInputStream(p1);
		ObjectInputStream ois=new ObjectInputStream(fis);
	
		Cricketer1 c1=(Cricketer1)ois.readObject();
		c1.display();
		
fis.close();
ois.close();
	}
}
}
