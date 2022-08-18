package com.filehandling.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File02 {

	public static void main(String[] args) {
 
		FileReader     in = null; //to read a file
		BufferedReader bf = null;/*used to read the text from a character-based input stream. 
								   It can be used to read data line by line by readLine() method.It makes the performance fast*/
		
		try {
    	
			List<String>lines = new ArrayList<String>(); //to store data
	    	
	        in= new FileReader("text.txt");
	        bf = new BufferedReader(in);
	     
	        String line = bf.readLine();
	     
	        while (line != null) { // to read text into line by line 
	    	   lines.add(line);
	    	   
	    	   line = bf.readLine();
	    	   
	    	   if(line == null)
	    		   break;
	         
	       }
	       
	       String[] str = lines.toArray(new String[lines.size()]);
	       
	       for(String s : str)
	    	   System.out.println("\n\n" + s);
	    
		   }
	    
	       catch(FileNotFoundException ex) {
	    	  System.out.println(ex.getMessage());
	       }
	       catch(IOException ex) {  
	    	  System.out.println(ex.getMessage());  
	       }

    		finally {
    			try {
    			
    				if(in!=null)
    					in.close();

    				if(bf !=null)
    					bf.close();
    				}
    		
    		catch(Exception ex){
    			ex.printStackTrace();
    			
    		}
    	}
	}
}
