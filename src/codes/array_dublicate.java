package codes;

import java.util.Scanner;

public class array_dublicate {
	
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
		
		int count=0;
		int var=0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					System.out.println("Duplicate :"+array[i]);
				}
			}
		}
		
	}

}
