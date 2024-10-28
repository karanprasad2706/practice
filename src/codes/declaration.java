package codes;

import java.util.Scanner;

public class declaration {
	
	public static  void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size Of Array");
		int n = sc.nextInt();
		
		System.out.println("Enter a Array Number");
		int array[] = new int[n];
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
			
		}
		
		System.out.println("Array :");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] +" ");
		}
		
	}

}
