package inharitance;

import java.util.Scanner;

public class Exam extends Cutural{
	
	void Exam()
	{
		System.out.println("\n\t\t\tExam Timetables\n");
		System.out.println("\nSr\t\tExam Name\t\tDate\t\t\tTime");
		System.out.println("01\t\tHindi\t\t\t06/01/2001\t\t03AM");
		System.out.println("02\t\tMarathis Walk\t\t07/01/2001\t\t03AM");
		System.out.println("03\t\tEnglish \t\t08/01/2001\t\t03AM");
		System.out.println("04\t\tJapeness\t\t09/04/2001\t\t03AM");
		System.out.println("05\t\tFranch\t\t\t10/05/2001\t\t03AM");
	}
	
	void grade()
	{
		int i=0;
		
		Scanner sss = new Scanner(System.in);
		
		
		System.out.println("\n\t\t\tEnter Marks Details\n");
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
		
		
		
		Academic sc1 = new Academic();
		sc1.Academic();
		Sports sc2 = new Sports();
		sc2.Sports();
		Cutural sc3 = new Cutural();
		sc3.Cutural();
		Exam sc4 = new Exam();
		sc4.Exam();
		sc4.grade();
	}
}
