package com.tvsmotor.day5.array;

import java.util.*;
public class ArrayDemo1 {
	public static int[] getArray()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:-");
		int size = scan.nextInt();
		int array [] = new int[size];
		System.out.println("Enter " + size + "values :-");
		for(int iter = 0;iter < size; ++iter)
		{
			array[iter] = scan.nextInt();
		}
		return array;
	}
	public int getMaximum(int[] array)
	{
		int maxi = array[0];
		int size = array.length;
		for (int iter : array)
		{
			if(maxi < iter)
			{
				maxi = iter;
			}
		}
		return maxi;
	}
	public int getMinimum(int[] array)
	{
		int mini = array[0];
		int size = array.length;
		for (int iter : array)
		{
			if(mini > iter)
			{
				mini = iter;
			}
		}
		return mini;
	}
	public static void main(String[] args) {
//		int arr[] = new int[10];
//		System.out.println(arr.length);
//		System.out.println(arr[0]);
//		
//		int marks[] = {10, 30, 70, 99, 56};
//		for(int mark : marks)
//		{
//			System.out.println(mark);
//		}
		ArrayDemo1 ad1 = new ArrayDemo1();
		int a[] = ad1.getArray();
		System.out.println("Maximum: "+ad1.getMaximum(a));
		System.out.println("Minimum: "+ad1.getMinimum(a));
	}

}
