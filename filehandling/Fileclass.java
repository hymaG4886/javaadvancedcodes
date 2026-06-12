 package filehandling;
 import java.io.*;

public class Fileclass {

	public static void main(String[] args) throws IOException {
		String p1="C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\newfile.txt";
		File f1=new File(p1);
		f1.createNewFile();  // create specified  new file in the path
		System.out.println("1 "+f1.exists()); //checks file is present or not
		System.out.println("2 "+f1.canExecute());//check if the file can have execute 
		System.out.println("3 "+f1.canWrite());
		System.out.println("4 "+f1.canRead());
		System.out.println("5 "+f1.getAbsolutePath());
		System.out.println("6 "+f1.getCanonicalPath());
		System.out.println("7 "+f1.getFreeSpace());
		System.out.println("8 "+f1.getName());
		System.out.println("9 "+f1.getParent());//display the  root path 
		System.out.println("10 "+f1.getPath());// display the file path
		System.out.println("11 "+f1.getTotalSpace());//display the space available in bytes
		System.out.println("12 "+f1.getUsableSpace());//display the usable spaces
		System.out.println("13 "+f1.hashCode());//unique value for the file object
		System.out.println("14 "+f1.isAbsolute());//checks if it is an absolute path
		System.out.println("15 "+f1.isDirectory());//checks if the path points to directory
		System.out.println("16 "+f1.isFile());//checks if the path points to file
		System.out.println("17 "+f1.isHidden());//checks if the path points to hidden file
		File f2=new File("C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\newfile2.txt");
		System.out.println("18 "+f2.isHidden());//last modified values in terms of long
		System.out.println("19 "+f1.length());//prints the total number of characters in the file
//		File f3=new File("C:\\Users\\gadda\\OneDrive\\Desktop\\filehandling\\newfile2.txt");
//		System.out.println("20 "+f1.renameTo(f3));
//		System.out.println("21 "+f1.exists());

		
	}

}
