package com.tvsmotor.day4.encapsulation;
public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        // employee.name = "Sachin"; : This gives error.
        employee.setId(1);
        employee.setName("Sachin");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}