package com.main.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;






public class CountWords {

	public static void main(String[] args) throws IOException{
		File fp= new File("C:/Folder1/two.txt");
		if(fp.exists()){
			System.out.println("File exists");
		}else{
			System.out.println("file does not exist");
		}
	

		
		
		FileReader fr = new FileReader(fp);
		BufferedReader br = new BufferedReader(fr);
		int lines =0;
		int words =0;
		int length=0;
		int charct =0;
		
		String text;
		String letters="";
		int searchOccurence=0;
		
		try{
			while((text=br.readLine())!=null){
				letters+=text;
				lines+=0;
				
				String[] word=text.split(" ");
				for(String wor : word){
					words++;
				
					if (wor.equalsIgnoreCase("Two"))
						searchOccurence++;
				}
				text.length();
			}
		
		
	}
	
	catch(IOException ee){
		System.out.println("file not found");
	}

		System.out.println("line:  "+lines);
		System.out.println("word:  "+words);
		System.out.println("length: "+length);
		
		System.out.println("search Occurence  "+ searchOccurence );
	
	}
}
	
		
		
	
		
		

		    