package exception_handling;

import java.util.Scanner;

public class Scanner_Exeption {

	public static void main(String[] args) {
		
		Scanner ne =  new Scanner(System.in);
		
		
		
		try
		{
			System.out.println("Enter Your Age");
			int name = ne.nextInt();
			System.out.println("Your Name :"+name);
		}
		catch(Exception e)
		{
			
			System.out.println("Input Age is Invilade !!!");
		}
	}
}
