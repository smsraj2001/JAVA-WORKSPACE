package com.tvsmotor.day6.filehandling;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class FileWriterDemo 
{
	public static void main(String[] args) throws IOException 
	{
		
//		File file = new File("abc.txt");
//		FileWriter fw = new FileWriter(file);
		
		// The above 2 lines condenses to the below one
		
		// FileWriter fileWriter = new FileWriter(new File("hello.txt"));
		FileWriter fileWriter = new FileWriter(new File("hello.txt"), true); // To append instead of overwriting.
		fileWriter.write("hello \n");
		fileWriter.write(65);
		fileWriter.write(97);
		fileWriter.flush();
		fileWriter.close();
		
		System.out.println("Data written to the file.");
	}

}
