package com.main.strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceString {

	public static void main(String[] args) {
		
		
		try
        {
        File file = new File("C:/Folder1/two.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "", oldtext = "";
        while((line = reader.readLine()) != null)
            {
            oldtext += line + "";

        }
        reader.close();
        // replace a word in a file
        String newtext = oldtext.replaceAll("One", "Zero");
               
            
        FileWriter writer = new FileWriter("C:/Folder1/two.txt");
        writer.write(newtext);writer.close();
    }
    catch (IOException io)
        {
        io.printStackTrace();
    }
		

}

	}


