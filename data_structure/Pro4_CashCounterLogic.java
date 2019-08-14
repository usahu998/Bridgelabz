package com.bridgelabz.data_structure;

public class Pro4_CashCounterLogic 
{
	static int queue[] =new int[100];
	static int size;
	static int front;
	static int rear;
	static int balance=0;
	void enQueue(int data)
	{
		if(!isFull())
		{
			queue[rear]=data;
			rear=(rear+1)%100;
			size=size+1;
			balance =balance+data;
		}
		else
			System.out.println("Queue is full");
	}
	
	static void show()
	{
//		for (int i = 0; i < size; i++) 
//		{
//			System.out.println(queue[front+i]+" ");
//			
//		}
		System.out.println("Total balance ="+ balance);
			
	}
	
	public int deQueue()
	{
		int data=queue[front];
		if(!isEmpty())
		{
			front=(front+1)%100;
			size=size-1;
			balance=balance-data;
		}
		else
		{
			System.out.println("Queue is empty");
		}
		return data;
	}
	
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;   //getSize();
	}
	
	public boolean isFull()
	{
		return size==100;    //getsize();
	}
	
	public void withdraw(int wd)
	{
		balance=balance-wd;
	}

	
	
	

}
