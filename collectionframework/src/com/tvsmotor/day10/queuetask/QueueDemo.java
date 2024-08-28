package com.tvsmotor.day10.queuetask;

import java.util.Scanner;

class Queue
{
	int queue[] = new int[5];
	int front = 0;
	int rear = -1;
	int n = 5;
	void enqueue(int data) 
	{
		if(rear == n - 1) 
		{
			System.out.println("Array is full");
			return;
		}
		queue[++rear] = data;
		System.out.println(data + " added");
	}
	void dequeue() 
	{
		if(front > rear) 
		{
			System.out.println("No elements found");
			return;
		}
		for (int i = 0; i < rear; i++) 
		{
			queue[i] = queue[i + 1];
		}
		rear--;
	}
	void queueFront() 
	{
		if(rear == -1) 
		{
			System.out.println("No element found in array");
			return;
		}
		System.out.println("Front of queue: " + queue[front]);
		for(int iter = front; iter <= rear; iter++)
		{
			System.out.print(queue[iter] + ", ");
		}
		System.out.println();
	}
}

public class QueueDemo 
{
	public static void main(String[] args) 
	{
		Queue queue = new Queue();
//		queue.enqueue(5);
//		queue.enqueue(10);
//		queue.dequeue();
//		queue.queuefront();
//		queue.enqueue(15);
//		queue.queuefront();
		Scanner scan = new Scanner(System.in);

        while (true) 
        {
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. DISPLAY FRONT");
            System.out.println("4. EXIT");
            System.out.println("Enter your operation");
            int ch = scan.nextInt();
            if (ch == 1) 
            {
                System.out.println("Enter element to push:-");
                int ele = scan.nextInt();
                queue.enqueue(ele);
            } 
            else if (ch == 2) 
            {
                queue.dequeue();
            } 
            else if (ch == 3) 
            {
            	queue.queueFront();
                System.out.println();
            } 
            else 
            {
                System.exit(0);
            }
        }
    }
}
