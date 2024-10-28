package encapsulation;
import java.util.Scanner;

public class databinding {

	public static void main(String[] args) {
		
		databinding2 sc = new databinding2();
//		sc.setusername("Karan_123");
//		sc.setpassword("Kancha_BOSS");	
//		System.out.println("Username :"+sc.getusername());
//		System.out.println("Username :"+sc.getpassword());

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Usarname :");
		String name = s.next();
		sc.setUsername(name);
		
		System.out.println("Enter Password :");
		String pass = s.next();
		sc.setPassword(pass);
		
		System.out.println("Enter Mail :");
		String maaill = s.next();
		sc.setMail(maaill);
		
		System.out.println("Enter Contact :");
		String cont= s.next();
		sc.setContact(cont);
		
		
		System.out.println("\t\t\tUser Infomations\n");
		System.out.println("Username :"+sc.getUsername());
		System.out.println("Username :"+sc.getPassword());
		System.out.println("Username :"+sc.getMail());
		System.out.println("Username :"+sc.getContact());
		
	}
}

