package com.tvsmotor.day10.stacktask;

import java.util.Scanner;

class Stack 
{
    int n = 5;
    int[] stack = new int[n];
    int top = 0;

    void push(int data) 
    {
        if (this.top == n) 
        {
            System.out.println("Stack is FULL");
        } 
        else 
        {
            stack[this.top] = data;
            this.top++;
        }
    }

    int pop() 
    {
        if (this.top == 0) 
        { 
            System.out.println("Stack is EMPTY");
            return -1;
        } 
        else 
        {
            this.top--; 
            int ele = stack[this.top]; 
            return ele;
        }
    }

    void display() {
        for (int i = 0; i < top; i++) 
        {
            System.out.print(stack[i] + ", ");
        }
    }
}

public class StackDemo 
{
    public static void main(String[] args) 
    {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);

        while (true) 
        {
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.println("Enter your operation");
            int ch = sc.nextInt();
            if (ch == 1) 
            {
                System.out.println("Enter element to push:-");
                int ele = sc.nextInt();
                stack.push(ele);
            } 
            else if (ch == 2) 
            {
                int ele = stack.pop();
                if (ele != -1) {
                    System.out.println("Popped element is: " + ele);
                }
            } 
            else if (ch == 3) 
            {
                stack.display();
                System.out.println();
            } 
            else 
            {
                System.exit(0);
            }
        }
    }
}
