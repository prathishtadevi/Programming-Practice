package com.main.file;

import java.io.File;

public class FileNameInFolder {

	public static void main(String[] args) {
		
		File file = new File("C:/Prathishta");

        String[] fileList = file.list();

        for(String name:fileList){

            System.out.println(name);

        }

    }
}



