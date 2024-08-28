package com.stackroute;

public class BubbleSort {

    public BubbleSort() 
    {
    }
    
    // Swapping values for bubble sort
    public static void swap(int first, int second, int[] array)
    {
    	int temp = array[second];
    	array[second] = array[first];
    	array[first] = temp;
    }
    
    //return the answer as a string in the desired output format
    public static String countSwaps(int[] array) 
    {
    	int countSwap = 0;
    	int size = array.length;
    	for (int iter = 0; iter < size; iter++) 
    	{
    	    for (int iterj = 0; iterj < size - 1; iterj++) 
    	    {
    	        // Swap adjacent elements if they are in decreasing order
    	        if (array[iterj] > array[iterj + 1]) 
    	        {
    	            swap(iterj, iterj + 1, array);
    	            countSwap++; // Count the swap
    	        }
    	    }
    	    
    	}
    	// .toString Function to get in String format.
        return "Array is sorted in "+Integer.toString(countSwap)+" swaps.\nFirst Element: "+Integer.toString(array[0])+"\nLast Element: "+Integer.toString(array[size - 1]);
    }


}
