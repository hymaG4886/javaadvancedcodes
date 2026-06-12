package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Fileprogram3 {



	public static void main(String[] args)  throws  FileNotFoundException, IOException{
		String p1="C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\Input3.txt";
		String p2="C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\Output3.txt";
		
		FileInputStream  fis=new FileInputStream (p1);
		BufferedInputStream  bis=new BufferedInputStream (fis);
		int temp;
		FileOutputStream  fos=new FileOutputStream (p2);
		BufferedOutputStream  bos=new BufferedOutputStream (fos);

		while((temp=fis.read())!=-1) {
			bos.write(temp);
		}
		bis.close();
		
		fis.close();
		bos.close();
		fos.close();
		
		
	}
		
		

	}




