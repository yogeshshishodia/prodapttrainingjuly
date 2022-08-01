package com.prodapt.dayfive.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		//InputStream to read data from source and OutputStream to write data to destination
		//Read a byte from  a file
		//try {
			try(FileInputStream fis = new FileInputStream("D:\\output\\prodapt\\output2.txt");){
			/**
			//Read single character from a file
			System.out.println(fis.read());
			int i = fis.read();
			System.out.println(i);
			System.out.println((char)i);
			**/
			//Read all characters
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
			//fis.close();
		}catch(FileNotFoundException e ) {
			e.printStackTrace();
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}
}
