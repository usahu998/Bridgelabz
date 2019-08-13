package FunctionProgramming;

import java.util.Scanner;

public class Pro11_Distance {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the point X");
			//int x = Integer.parseInt(args[0]);
			int x=sc.nextInt();
			System.out.println("Enter the point Y");
			//int y = Integer.parseInt(args[1]);
			int y=sc.nextInt();

			

			double d = Math.sqrt((x*x) + (y*y));

			System.out.println("Euclidean Distance= " + d);

	}

}
