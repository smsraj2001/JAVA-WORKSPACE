package com.tvsmotor.day11.collection;

import java .util.ArrayList;
import java.util.ListIterator;

public class ListIterateDemo {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(1);
		marks.add(2);
		marks.add(3);
		marks.add(4);
		ListIterator<Integer> litr = marks.listIterator();
		System.out.println("-----Printing from LIST ITERATOR METHOD, Using list iterator----");
		System.out.println("-------FORWARD------");
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("-------BACKWARD------");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}

}
