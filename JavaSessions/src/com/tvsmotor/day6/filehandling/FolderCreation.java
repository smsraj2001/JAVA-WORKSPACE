package com.tvsmotor.day6.filehandling;

import java.io.File;

public class FolderCreation {
	public static void main(String[] args) {
		// File file = new File("movies");
		File file = new File("/home/zadmin/Desktop/movies"); // Creating folder in different path.
		// File file = new File("E:\\tvs motors\\movies");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.exists());
		
	}

}
