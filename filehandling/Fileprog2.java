package filehandling;
import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;

	public class Fileprog2 {
		public static void main(String[] args)  throws  IOException{
			String p1="C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\Input1.txt";
			String p2="C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\Output1.txt";
			
			FileReader fr=new FileReader(p1);
			BufferedReader br=new BufferedReader(fr);
			int temp;
			FileWriter fw=new FileWriter(p2);
			BufferedWriter bw=new BufferedWriter(fw);

			while((temp=fr.read())!=-1) {
				fw.write(temp);
			}
			br.close();
			
			fr.close();
			bw.close();
			fw.close();
			
			
		}
			
			

		}

