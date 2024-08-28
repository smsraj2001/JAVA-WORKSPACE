package com.tvsmotor.day11.collection;

import java.util.Stack;
public class StackDemo 
{
	static void display(Stack<Integer> stack)
	{
		System.out.println("--------The current contents of the stack are:--------");
		for(int element : stack)
		{
			System.out.println(element);
		}
		System.out.println("-----------------------------------------------");
	}
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("----Using PUSH, POP, PEEK---------");
		stack.push(1);
		System.out.println("Push 1");
		stack.push(2);
		System.out.println("Push 2");
		stack.push(3);
		System.out.println("Push 3");
		display(stack);
		System.out.println("Peek: " + stack.peek());
		System.out.println("POP 2 times: " + stack.pop() + " " + stack.pop());
		display(stack);
		System.out.println("Peek: " + stack.peek());
		stack.push(4);
		System.out.println("Push 4");
		display(stack);
		System.out.println("Peek: " + stack.peek());
		
		stack = new Stack<Integer>();
		System.out.println("----Using ADD, REMOVE, PEEK---------");
		stack.add(1);
		System.out.println("Push 1");
		stack.add(2);
		System.out.println("Push 2");
		stack.add(3);
		System.out.println("Push 3");
		display(stack);
		System.out.println("Peek: " + stack.peek());
		System.out.println("POP 2 times: " + stack.remove(0) + " " + stack.remove(1));
		display(stack);
		System.out.println("Peek: " + stack.peek());
		stack.add(4);
		System.out.println("Push 4");
		display(stack);
		System.out.println("Peek: " + stack.peek());
	}
}
