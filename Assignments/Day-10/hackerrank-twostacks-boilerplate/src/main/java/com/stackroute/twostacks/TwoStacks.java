package com.stackroute.twostacks;

import java.util.Stack;

public class TwoStacks {

    public TwoStacks() 
    {}

    //complete the functions for this class using 2 stacks
    public static class MyQueue<T> 
    {
        Stack<T> stackNewestOnTop = new Stack<>();
        Stack<T> stackOldestOnTop = new Stack<>();

        public void push(T value) 
        {
            stackNewestOnTop.push(value);
        }

        public void pop() 
        {
            shiftStacks();
            if (!stackOldestOnTop.isEmpty()) 
            {
                stackOldestOnTop.pop();
            }
        }

        public T peek() 
        {
            shiftStacks();
            if (!stackOldestOnTop.isEmpty()) 
            {
                return stackOldestOnTop.peek();
            }
            return null;
        }

        private void shiftStacks() 
        {
            if (stackOldestOnTop.isEmpty()) 
            {
                while (!stackNewestOnTop.isEmpty()) 
                {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }
    }
}
