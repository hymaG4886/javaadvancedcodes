package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Program {

	public static void main(String[] args)  throws  IOException{
		String p1="C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\Input.txt";
		String p2="C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\Output.txt";
		
		FileReader fr=new FileReader(p1);
		int temp;
		FileWriter fw=new FileWriter(p2);
		while((temp=fr.read())!=-1) {
			fw.write(temp);
		}
		fr.close();
		fw.close();
		
		
	}
		
		

	}


