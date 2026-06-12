package filehandling;
import java.io.*;
import java.util.Scanner;

public class Readwritescan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String p1="C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\readwritescan.txt";
			FileWriter fw=new FileWriter(p1);
			fw.write("hello Every one how are you all");
			fw.close();
			System.out.println("Reading the data from the file : ");
			FileReader fr=new FileReader(p1);
			java.util.Scanner sc=new Scanner(fr);
			while(sc.hasNextLine()) {
				String temp=sc.next();
				System.out.println(temp);	
			}
			sc.close();
			fr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}

	}

}
