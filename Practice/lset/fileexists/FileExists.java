package fileexists;

import java.io.File;
import java.io.FileWriter;
public class FileExists{
	
	public static void main(String... args) throws Exception {
		 File file = new File("test.txt");  
		 System.out.println(file.exists());
		 FileWriter fw = new FileWriter(file); 
		 System.out.println(file.exists());
	}
	
}
