package pattern;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number :");
		int num = sc.nextInt();
		
//		RECTANGLE
//		* * * * * * * * * 
//		* * * * * * * * * 
//		* * * * * * * * * 
//		* * * * * * * * * 
//		* * * * * * * * * 
//		* * * * * * * * * 
//		* * * * * * * * * 
//		* * * * * * * * * 
//		* * * * * * * * * 
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=num;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
//		TRANGLE
//
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
		System.out.println("\n\n");
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
//		REVERSE TRANGLE
//		* * * * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		System.out.println("\n\n");
		for(int i=0;i<=num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
