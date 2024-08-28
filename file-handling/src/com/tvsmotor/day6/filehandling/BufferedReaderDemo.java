package com.tvsmotor.day6.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("hello.txt");
		BufferedReader br = new BufferedReader(fileReader);
		
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		String line = br.readLine();
		while(line != null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		
	}

}
