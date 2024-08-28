package com.tvsmotor.day12.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo2 {
	public static void main(String[] args) 
	{
		ArrayList<Employee> employees = new ArrayList<>();
	    employees.add(new Employee(1, "John", 87000, "digital", 24));
	    employees.add(new Employee(2, "Mohit", 72000, "data", 26));
	    employees.add(new Employee(3, "Kumar", 65000, "hr", 30));
	    employees.add(new Employee(41, "Ankit", 55000, "digital", 31));
	    employees.add(new Employee(5, "Mahesh", 71000, "hr", 31));
	    employees.add(new Employee(6, "Sourab", 45000, "digital", 32));
	    employees.add(new Employee(7, "Raj", 92000, "data", 33));
	    employees.forEach(s -> System.out.println(s));
	    employees.forEach(System.out::print);
	    
	    long empcount = employees.stream().count();
	    System.out.println();
	    System.out.println("Total employee: " + empcount);

	    long hrCount = employees.stream().filter(e -> e.getDept().equalsIgnoreCase("HR")).count();
	    System.out.println("Total HR count: " + hrCount);
	    
	    System.out.println("-------All the HR details displayed-------");
	    employees.stream().filter(e -> e.getDept().equalsIgnoreCase("HR")).forEach(e -> System.out.println(e));
	    
	    System.out.println("-------Per day Salary of all employee:--------");
	    employees.stream().map(e -> e.getSalary()/ 30).forEach(System.out::print);
	    
	    System.out.println("-------Per day Salary of all employee with details:--------");
	    employees.stream().map(e -> e.getName() + ": " + (e.getSalary()/ 30)).forEach(System.out::println);
	    
	    System.out.println("-------HR PER DAY SALARY-------");
	    employees.stream().filter(e -> e.getDept().equalsIgnoreCase("HR")).map(e -> e.getName() + ": " + (e.getSalary()/ 30)).forEach(System.out::println);
	    
	    System.out.println("---------Sorting by age---------");
	    employees.stream().sorted(Comparator.comparing(Employee :: getAge)).forEach(System.out::println);
	    
	    System.out.println("--------- Sorting by age, if same sort by id---------");
	    employees.stream()
	    .sorted(Comparator.comparing(Employee :: getAge).thenComparing(Comparator.comparing(Employee :: getId)))
	    .forEach(System.out::println);
	    
	    System.out.println("---------Sorting by age in reverse order using lambda function---------");
	    employees.stream()
	    .sorted((o1, o2) -> {
	    	if(o1.getAge() > o2.getAge())
	    		return -1;
	    	else if(o1.getAge() < o2.getAge())
	    		return 1;
	    	return 0;
	    })
	    .forEach(System.out::println);
	    
	    System.out.println("-----------Using collect terminal operation------------");
	    List<Employee> emplist = employees.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());
	    emplist.forEach(System.out::println);
	    
	    System.out.println("------Using collect terminal operation to find sum and average of salaries------");
	    
	    long sumSalary = employees.stream().collect(Collectors.summingInt(Employee :: getSalary));
	    System.out.println("Total Salary: " + sumSalary);
	    
	    double avgSalary = employees.stream().collect(Collectors.averagingInt(Employee :: getSalary));
	    System.out.println("Average Salary: " + avgSalary);	   
	    
	    System.out.println("-------Lowest Salary---------");
	    Optional<Employee> emp = employees.stream().min(Comparator.comparing(Employee :: getSalary));
	    if(emp.isPresent())
	    {
	    	System.out.println(emp.get());
	    }
	    
	    int lowestSalary = employees.stream().min(Comparator.comparing(Employee :: getSalary)).get().getSalary();
	    System.out.println("The salary is: " + lowestSalary);
	    
	    System.out.println("---------Sorting in Reverse Order----------");
	    employees.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).forEach(System.out::println);
	}
}

