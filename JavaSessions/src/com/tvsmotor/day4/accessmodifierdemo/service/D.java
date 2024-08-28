package com.tvsmotor.day4.accessmodifierdemo.service;

import com.tvsmotor.day4.accessmodifierdemo.sales.A;

public class D extends A{
    public static void main(String[] args) {
        A obj = new A();
        // System.out.println(obj.c); // Cannot access as 'c' is a protected variable.
        System.out.println(obj.d);
    }
}