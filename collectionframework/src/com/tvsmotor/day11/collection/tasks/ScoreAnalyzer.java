package com.tvsmotor.day11.collection.tasks;

import java.util.Collections;
import java.util.LinkedList;
public class ScoreAnalyzer 
{
	private LinkedList<Integer> runsdata;
	
	public ScoreAnalyzer(LinkedList<Integer> runsdata) 
	{
		super();
		this.runsdata = runsdata;
	}
	
	public void addRunsToList(int runsscored)
	{
		runsdata.add(runsscored);
	}
	public double calcRunRate()
	{
		int totalruns = 0;
		double runrate = 0.0d;
		for(int run : runsdata)
		{
			totalruns += run;
		}
		runrate = (double) totalruns / 50;
		return runrate;
	}
	public int lowestRunsScored()
	{
		return Collections.min(runsdata);
	}
	public void displayRuns()
	{
		int id = 1;
		for(int runs : runsdata)
		{
			System.out.print(id + "-" + runs + " ");
			id++;
		}
		System.out.println();
	}
}
