package com.tvsmotor.day6.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterDemo 
{
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt", true);
		BufferedWriter  bw = new BufferedWriter(fw);
		bw.write("hello");
		bw.newLine();
		bw.write("welcome");
		bw.newLine();
		
		bw.flush();
		bw.close();
		
		
		
	}

}
