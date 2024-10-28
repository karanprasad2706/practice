package encapsulation;

import java.util.Scanner;

import class_objects.Constructor;

public class programm {
	
	int pin ;
	String name, address,contact , owner,est_date ;
	String bname,author,type,edition;
	double price;
	int pages;
	
	programm(String name, String address,int pin,String contact ,String owner,String est_date)
	{
		this.name = name;
		this.address = address;
		this.pin=pin;
		this.contact = contact;
		this.owner = owner;
		this.est_date = est_date;
	}


	public String toString() {
		return "name= "+ name + " \t\t\tAddress=" + address +
				" \nContact=" + contact + 
				"\t\t\tpin=" + pin + " \nOwner=" + owner +
				"\t\ttest_date=" + est_date ;			
	}
	
	
	void bookdetails(String bname,String author,String types,int page,double price,String edition)
	{

		System.out.println("Book Details :");
		System.out.println("Book Name :"+bname);
		System.out.println("Book Author :"+author);
		System.out.println("Book Type :"+type);
		System.out.println("Booky Pages :"+pages);
		System.out.println("Book Edition :"+edition);
		System.out.println("Book Price :"+price);
		
	}
	
	

	public static void main(String[] args)
	{
		programm em = new programm("Library-Hub","Kalyan,Andher Nagri, Maharashtra,Thane ",421306,"9878998789","CEO Mr.Karan Prasad","1991-2024");
		System.out.println(em);
		
		int i = 0;
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter Number Of Book :");
		int n = scc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Book Name :");
			String bname = scc.next();
			System.out.println("Enter Author Name :");
			String author = scc.next();
			System.out.println("Enter Book Type :");
			String type = scc.next();
			System.out.println("Enter Number's Of pages :");
			int pages = scc.nextInt();
			System.out.println("Enter Book edition :");
			String edition = scc.next();
			System.out.println("Enter Your Book Price :");
			double price = scc.nextDouble();
			
			double dprice= 0;
			double nprice = 0;
			
			if(price>1200) {
				System.out.println("Congratuation You Have Got 30 % Discount !!!!");
				dprice = price*0.30;
			}
			else if(price<1200 && price>700) {
				System.out.println("Congratuation You Have Got 20 % Discount !!!!");
				dprice = price*0.20;
			}
			else if(price<700 && price>450)
			{
				System.out.println("Congratuation You Have Got 15 % Discount !!!!");
				dprice = price*0.15;
			}
			else
			{
				System.out.println("Congratuation You Have Got 10 % Discount !!!!");
				dprice = price*0.10;
				
			}
			
			nprice = price - dprice;
			System.out.println("Discount Price :"+dprice);
			System.out.println("Book's Discounted Price :"+(nprice));
			
		}
		
//		int total = 0;
//		System.out.println("Total Price :" +nprice*n);
		
	
	}
}
