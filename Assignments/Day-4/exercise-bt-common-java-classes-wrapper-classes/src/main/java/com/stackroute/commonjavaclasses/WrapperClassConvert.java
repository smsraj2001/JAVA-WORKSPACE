package com.stackroute.commonjavaclasses;

public class WrapperClassConvert 
{

    //write logic to determine and convert given primitive type to its wrapper class and return result
    public Object convertToWrapper(Object input) 
    {
    	 if (input == null) 
    	 {
             return "Give proper primitive type as input";
         }
         
         // Determine the type of input and convert to its wrapper class
         if (input instanceof Integer) 
         {
        	 return Integer.valueOf((int) input); // Integer wrapper class for int
         } 
         else if (input instanceof Double) 
         {
             // return (Double) input;   
             return Double.valueOf((double) input); // Double wrapper class for double
         } 
         else if (input instanceof Boolean) 
         {
        	 return Boolean.valueOf((boolean) input);  // Boolean wrapper class for boolean
         } 
         else if (input instanceof Character) 
         {
        	 return Character.valueOf((char) input); // Character wrapper class for char
         } 
         else if (input instanceof Byte) 
         {
        	 return Byte.valueOf((byte) input);     // Byte wrapper class for byte
         } 
         else if (input instanceof Short) 
         {
        	 return Short.valueOf((short) input);    // Short wrapper class for short
         } 
         else if (input instanceof Long) 
         {
        	 return Long.valueOf((long) input);     // Long wrapper class for long
         } 
         else if (input instanceof Float) 
         {
        	 return Float.valueOf((float) input);    // Float wrapper class for float
         } 
         return "Give proper primitive type as input";
    }
}

