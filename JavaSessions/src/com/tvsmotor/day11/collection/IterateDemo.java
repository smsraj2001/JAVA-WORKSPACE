package com.tvsmotor.day11.collection;

import java .util.ArrayList;
import java.util.Iterator;
public class IterateDemo {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(1);
		marks.add(2);
		marks.add(3);
		marks.add(4);
		
		System.out.println("Marks: " + marks);
		for(Integer mark : marks)  // (OR) for(int mark : marks)
		{
			System.out.println(mark);
		}
		// Cursor class
		Iterator<Integer> itr = marks.iterator();
		System.out.println("-----Printing from ITERATOR METHOD, Using iterator----");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
