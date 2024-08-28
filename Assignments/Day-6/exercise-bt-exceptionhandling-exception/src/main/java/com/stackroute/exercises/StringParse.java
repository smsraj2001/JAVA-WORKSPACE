package com.stackroute.exercises;

public class StringParse 
{
    //Write logic to find the character from the sentence at specified location
    public char characterLocator(String sentence, String location) 
    {
    	if(Integer.valueOf(location) instanceof Integer)
    	{
    		int position = (Integer.parseInt(location));
    		int size = sentence.length();
    		if(position >=0 && position < size)
    		{
    			return sentence.charAt(position);
    		}
    		else
    		{
    			throw new StringIndexOutOfBoundsException("StringIndexOutOfBoundsException");
    		}
    	}
    	else
    	{
    		throw new NumberFormatException("NumberFormatException");
    	}
    }
}
    	