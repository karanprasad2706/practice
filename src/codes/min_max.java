package codes;

import java.util.Scanner;

public class min_max {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr Array Size :");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter Array Lenght :");
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
			
		}
		
		int min = array[0];
		int max = array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max) 
			{
				max = array[i];
			}
			if(array[i]<min)
			{
				min = array[i];
			}
		}
		
		System.out.println("Min :"+min+ "\n"+ "Max :"+max);
		
	}

}
