package com.stackroute.twostacks;

import java.util.Scanner;
import com.stackroute.twostacks.TwoStacks.MyQueue;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        MyQueue<Integer> queue = new MyQueue<>();
        int size = scan.nextInt();

        for (int iter = 0; iter < size; iter++) 
        {
            int choice = scan.nextInt();
            if (choice == 1) 
            {
                int data = scan.nextInt();
                queue.push(data);
            } 
            else if (choice == 2) 
            {
                queue.pop();
            }
            else if (choice == 3) 
            {
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
