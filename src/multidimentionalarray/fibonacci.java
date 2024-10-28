package multidimentionalarray;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numebr :");
		int n = sc.nextInt();
		
		int t1=0, t2 = 1;
		
		System.out.println("Fibonacci Series of " + n + "terms :");
		
		for(int i=1;i<=n; ++i)
		{
			System.out.print(t1 + ", ");
			int sum = t1 + t2;
			t1= t2;
			t2 = sum;
			
		}
	}

}
