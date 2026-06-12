package filehandling;
import java.io.*;
import java.io.FileOutputStream;
class Cricketer implements Serializable
{
	String name;
	String country;
	int runs;
	int wickets;
	int matches; 
	public Cricketer(String name,String country,int runs,int wickets,int matches){
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
	
}


public class Fileprogram6Serial {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Cricketer c1=new Cricketer("virat","ind",19000,20,300);
		c1.display();
		FileOutputStream fos=new  FileOutputStream("C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\Cricketer");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);
		
fos.close();
oos.close();
	}


}
