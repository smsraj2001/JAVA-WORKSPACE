package com.tvsmotor.day11.collection.tasks;

import java.util.LinkedList;
import java.util.Scanner;

public class TestScoreAnalyzer {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> runsdata = new LinkedList<Integer>();
		ScoreAnalyzer sca = new ScoreAnalyzer(runsdata);
		
//		sca.addRunsToList(20);
//		sca.addRunsToList(30);
//		sca.addRunsToList(150);
//		sca.addRunsToList(50);
//		sca.addRunsToList(2);
		
		System.out.println("Enter Runs. To stop enter -1:- ");
		int run_scored = 0;
		boolean flag = true;
		while(flag)
		{
			run_scored = scan.nextInt();
			if(run_scored < 0)
			{
				flag = false;
			}
			else
				sca.addRunsToList(run_scored);
		}
		
		System.out.println("Runs Scored: ");
		sca.displayRuns();
		System.out.println("Runrate: " + sca.calcRunRate());
		System.out.println("Lowest Runs: " + sca.lowestRunsScored());
		System.out.println("Count of player who batted: " + runsdata.size());
		scan.close();
	}
}
