package com.tvsmotor.day6.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileInputOutputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileOutputStream fileOutputStream = new FileOutputStream(new File("hello.txt")); // To append instead of overwriting.
		fileOutputStream.write(67);
		fileOutputStream.write(65);
		fileOutputStream.write(97);
		fileOutputStream.write('a'); // Writing of string is not allowed in OutputStream.
		fileOutputStream.flush();
		fileOutputStream.close();
		
		FileInputStream  fileInputStream = new FileInputStream("hello.txt");
		int read = fileInputStream.read();
		while(read != -1)
		{
			System.out.println((char)read);
			read = fileInputStream.read(); // Increment the cursor to next character.
		}
		
	}

}