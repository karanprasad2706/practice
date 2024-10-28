package multidimentionalarray;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int originalNum, digit,cubeSum = 0, num;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numebr :");
		int n = sc.nextInt();
		
		originalNum = n;
		
		while(n!=0)
		{
			digit = n % 10;
			cubeSum = (int) (cubeSum + Math.pow(digit, 4));
			n /= 10;
		}
		if(cubeSum == originalNum)
		{
			System.out.println(originalNum + " Is an ArmStrong Number ");
		}
		else
		{
			System.out.println(originalNum + " Is Not an ArmStrong Number ");
		}
	}

}
