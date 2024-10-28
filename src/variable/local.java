package variable;

import java.util.Scanner;

public class local {
	
	void Stud(String name,int age, String address,String email,String contact)
	{
		System.out.println("Enter Namee :"+name);
		System.out.println("Enter Agee :" +age);
		System.out.println("Enter Addresss :"+address);
		System.out.println("Enter Emaill :"+email);
		System.out.println("Enter Contactt :"+contact);
	}
	
	void grade()
	{
		int i=0;
		
		Scanner sss = new Scanner(System.in);
		
		
		System.out.println("Enter Your Marks :");
		System.out.println("Marks Of Maths :");
		int maths = sss.nextInt();
		System.out.println("Marks Of Java :");
		int java = sss.nextInt();
		System.out.println("Marks Of JS :");
		int js = sss.nextInt();
		
		int total = (maths+java+js)/3;

			if(total>75) {
				System.out.println("A grade");
			}
			else if(total<75 && total>50) {
				System.out.println("B gradee");
			}
			else if(total<50 && total>35)
			{
				System.out.println("C Grade");
			}
			else
			{
				System.out.println("Fail");
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Student :");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("\n");
			System.out.println("Enter Name :");
			String name =sc.next();
			System.out.println("Enter Age :");
			int age =sc.nextInt();
			System.out.println("Enter Address :");
			String address =sc.next();
			System.out.println("Enter Email :");
			String email =sc.next();
			System.out.println("Enter Contact :");
			String contact =sc.next();
			
			local s = new local();
			s.Stud(name, age, address, email, contact);
			s.grade();	
		}
		
		
	}

}
