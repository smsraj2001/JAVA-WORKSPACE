package com.tvsmotor.day6.filehandling;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReaderDemo 
{
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileReader fileReader = new FileReader("hello.txt");
//		System.out.println(fileReader.read());
//		System.out.println(fileReader.read()); // When data is not there, it returns -1 indicating EOF.
		
		int read = fileReader.read();
		while(read != -1)
		{
			System.out.println((char)read);
			read = fileReader.read(); // Increment the cursor to next character.
		}
		
	}

}