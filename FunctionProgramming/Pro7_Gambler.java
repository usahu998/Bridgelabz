package FunctionProgramming;

import java.util.Scanner;

public class Pro7_Gambler {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter Cash Amount");
		        int stake  =sc.nextInt();  
		        System.out.println("Enter how much money you want earn goal");
		        int goal   =sc.nextInt();     
		        System.out.println("Enter number of trials");
		        int trials =sc.nextInt();    
		        
		        int bets = 0;        
		        int wins = 0;        
		        double percentWon;

		        // repeat trials times
		        for (int t = 0; t < trials; t++) 
		        {

		            
		            int cash = stake;
		            while (cash > 0 && cash < goal) 
		            {
		                bets++;
		                if (Math.random() < 0.5) 
		                	cash++;     // win $1
		                else                     
		                	cash--;     // lose $1
		            }
		            if (cash == goal) 
		            	wins++;                
		        }

		        // print results
		        System.out.println(wins + " wins of " + trials);
		        percentWon= (100.0 * wins / trials);
		        System.out.println("Percent of games won = " + percentWon);
		        double percentLoss = (100.0-percentWon);
		        System.out.println("Percent of games loss = " + percentLoss);
		        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
		    


	}

}
