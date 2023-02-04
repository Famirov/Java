package module8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	
public static void main(String[] args) {
		
		
		readMyTextFile("src/module8/books.txt");
		
		
	}
	

	public static void readMyTextFile(String path) {
		
		Scanner scan = null;
		
		try {
			
		    FileInputStream myFile = new FileInputStream(path);
		    scan = new Scanner(myFile);
		    
		    while(scan.hasNextLine()) {
		    	    System.out.println(scan.nextLine());
		    }
		
		
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} finally {
			
			scan.close();
			
		}
		
		
	}

}
