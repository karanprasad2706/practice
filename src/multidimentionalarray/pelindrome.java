package multidimentionalarray;

import java.util.Scanner;

public class pelindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int originalNum = in.nextInt();
		
		int copyNum = originalNum;
		
		int reverseNum = 0;
		
		while(copyNum !=0) {
			int digit = copyNum % 10;
			reverseNum = reverseNum * 10 + digit;
			copyNum /= 10;
			
		}
		
		if (reverseNum == originalNum)
		{
			System.out.println(originalNum + "is pelidrome");
		}
		else 
		{
			System.out.println(originalNum + "  is not pelidrome");

		}
	}

}
