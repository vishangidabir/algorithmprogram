package com.bridgelabz;

public class BalanceParanthesis {
	private int maxSize;
	private long[] stackArray;
	private int top;

	public BalanceParanthesis() {
		
	}	
	//for size  
	public BalanceParanthesis(int s)
	{
	maxSize = s;
	stackArray = new long[maxSize];
	top = -1;
	}
	
	//for push   
	public void push(long j)
	{
	stackArray[++top] = j;
	}
	
	//for pop   
	public long pop() 
	{
	return stackArray[top--];
	}
	
	//for peek   
	public long peek() 
	{
	return stackArray[top];
	}
	
	//to check whether stack is empty	   
	public boolean isEmpty()
	{
	return (top == -1);
	}
	
	//to check whether stack is full	   
	public boolean isFull()
	{
	return (top == maxSize - 1);
	}
}


