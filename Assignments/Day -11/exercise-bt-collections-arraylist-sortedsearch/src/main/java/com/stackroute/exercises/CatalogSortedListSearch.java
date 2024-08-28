package com.stackroute.exercises;

import java.util.Collections;
import java.util.List;


public class CatalogSortedListSearch 
{
	
	private List<String> sortedCatalogList;

    //write here logic to get sorted Array List which is a global class variable
    public String catalogListSorter(List<String> unSortedCatalogList) 
    {
    	
    	if(unSortedCatalogList == null)
    	{
    		return "The catalog list is null";
    	}
    	else if(unSortedCatalogList.isEmpty())
    	{
    		return "The catalog List is empty";
    	}
    	else
    	{
    		for(String product : unSortedCatalogList)
    		{
    			if(product == null || product.isEmpty() || product.isBlank())
    			{
    				return "The catalog List contains empty or null or blank space as a value";
    			}
    		}
    	}
    	Collections.sort(unSortedCatalogList);
    	sortedCatalogList = unSortedCatalogList;
    	return sortedCatalogList.toString();
    }

    //write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) 
    {
    	if(sortedCatalogList == null)
    	{
    		return "The catalog list is null";
    	}
    	else if(value == null || value.isBlank() ||value.isEmpty())
    	{
    		return "Input is not accepted";
    	}
    	
    	int low = 0, high = sortedCatalogList.size() - 1;
    	while(low <= high)
    	{
    		int mid = low + (high - low) / 2;
    		if(sortedCatalogList.get(mid).compareToIgnoreCase(value) == 0)
    		{
    			return "Found: " + sortedCatalogList.get(mid);
    		}
    		else if(sortedCatalogList.get(mid).compareToIgnoreCase(value) < 0)
    		{
    			low = mid + 1;
    		}
    		else
    		{
    			high = mid - 1;
    		}
    	}
        return "Not Found";
    }
}