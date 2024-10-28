package exception_handling;

import java.util.Scanner;

public class Validateage {
	
	
	static void my()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int age = sc.nextInt();
		
		try 
		{
			if(age<18)
			{
				throw new InvalidAgeException("Baccha Hai Tu Abhi...");
			}
			else
			{
				System.out.println("Vote De Stkate Ho Aap");
			}
		}
		catch(InvalidAgeException s)
		{
//			System.out.println(s.getMessage());
			s.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Starting Exception....");
		
		my();
		System.out.println("End Of Excepttion...");
	}

}
