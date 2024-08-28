package com.tvsmotor.day11.collection;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("banana");
		fruits.add("mango");
		fruits.addFirst("apple");
		fruits.add(1, "pineapple");
		fruits.addLast("grapes"); // addLast() will add the element like append, but not necessarily the last element.
		fruits.add("lemon");
		System.out.println(fruits);
	}
}
