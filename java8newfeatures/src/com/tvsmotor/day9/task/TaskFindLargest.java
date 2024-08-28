package com.tvsmotor.day9.task;

interface Find3rdLargest
{
	int findLargest(int a, int b, int c);
}
public class TaskFindLargest {
	public static void main(String[] args) {
		Find3rdLargest large = (a, b, c) -> {
			if (a > b && a > c)
			{
				return a;
			}
			else if(b > a && b > c)
			{
				return b;
			}
			return c;
		};
		System.out.println("The largest of the 3 numbers is: " + large.findLargest(10,30,20));
	}

}
