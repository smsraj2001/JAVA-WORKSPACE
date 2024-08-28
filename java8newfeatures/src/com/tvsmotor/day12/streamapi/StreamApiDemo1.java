package com.tvsmotor.day12.streamapi;

import java.util.ArrayList;

public class StreamApiDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 1; i <= 10; ++i)
		{
			nums.add(i);
		}
		System.out.println("Numbers: " + nums);		
		System.out.println("The even numbers are:- ");
		for(int num : nums)
		{
			if(num % 2 == 0)
			{
				System.out.print(num + ", ");
			}
		}
		System.out.println();
		
		nums.stream().filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + ", "));
	}

}
