package exception_handling;

import java.util.Scanner;

public class productreview {

	public static void productreview()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter review according to aur services :");
			int rev = sc.nextInt();
			
			if(rev>=1 && rev<=5)
			{
				System.out.println("Thank You For Feedback !!");
			}
			else
			{
				throw new ReviewException("Invilid FeedBack");
			}
		}
		catch(ReviewException e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("FeedBack Page.");
		
		productreview();
		
		System.out.println("Done !!");
	}
}
