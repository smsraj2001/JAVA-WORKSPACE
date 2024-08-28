package com.tvsmotor.day6.filehandling;

import java.io.File;
import java.io.IOException;
public class FileCreationDemo {
	public static void main(String[] args) throws IOException // This is mandatory 
	{
		File file = new File("hello.txt");
		System.out.println(file.exists()); // Checks within the project.
		
		file.createNewFile();
		
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
	}

}
