package com.bridgelabz.data_structure;

import java.util.Scanner;

public class Pro4_CashCounter {

	
	public static void main(String[] args) 
	{
		Pro4_CashCounterLogic cc=new Pro4_CashCounterLogic();
		
		
		int ch = 0;
		do {
		Scanner sc=new Scanner (System.in);
		String str = "";
		System.out.println("========================================");
		System.out.println("---------Banking Cash Counter-----------");
		System.out.println("Enter your Option ");
		System.out.println(" 1-> Cash Deposit");
		System.out.println(" 2-> Cash Withdraw");
		System.out.println(" 3-> Number of people add in Queue");
		System.out.println(" 5-> show total Cash");
		System.out.println(" 4-> Exit");
		System.out.println("========================================");
		
		int Switch=sc.nextInt();
		
		switch(Switch)
		{
		case 1: System.out.println("Enter your cash amount for deposit");
				Integer depo=sc.nextInt();
				cc.enQueue(depo);			
			break;
			
		case 2: System.out.println("Enter your cash amount for withdraw");
				Integer withdraw=sc.nextInt();
				cc.withdraw(withdraw);
			
			break;
			
		case 3:
			int j=cc.size();
			System.out.println("the number of people"+j);
			
			break;
			
		case 4:
			System.exit(0);
			
		case 5:
			      cc.show();
			break;
			
		default:
			System.out.println("You entered wrong choice");
			break;
		
		
		}
		
		
		
		}while(ch<5);
	}

}
