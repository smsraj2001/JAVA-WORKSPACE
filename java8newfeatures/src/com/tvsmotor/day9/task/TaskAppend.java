package com.tvsmotor.day9.task;

interface TwoStringAppend
{
	String appendName(String firstname, String secondname);
}
public class TaskAppend {
	public static void main(String[] args) {
		TwoStringAppend sa2 = (firstname, secondname) -> {
			return firstname + " " + secondname;
		};
		System.out.println("Your name is: " + sa2.appendName("Sutharsan", "Raj"));
	}

}
