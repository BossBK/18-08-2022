package com.filehandling.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class File03 {
	
	public static void main(String[] args) {
    
		try {
   
			Scanner scan = new Scanner(new File("text.txt"));
			
			String current;
			String longWord = "";
			
			while(scan.hasNext()) {
				current = scan.next();
				
				if(current.length()>longWord.length()) {
					longWord = current;
					}
				}
			System.out.println("The Logest Word is : " + longWord);
			
		}
			catch(FileNotFoundException ex) {
				System.out.println(ex.getMessage());
			}
			catch(IOException ex) {  
				System.out.println(ex.getMessage());  
			}
	} 

}