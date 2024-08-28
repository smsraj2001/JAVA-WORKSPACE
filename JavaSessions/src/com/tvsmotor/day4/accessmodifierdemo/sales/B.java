package com.tvsmotor.day4.accessmodifierdemo.sales;
public class B {
    public static void main(String[] args) {
        A obj = new A();
        // System.out.println(obj.a); //Cannot access private variables.
    }
}