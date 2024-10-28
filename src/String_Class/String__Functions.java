package String_Class;

public class String__Functions {
	
	public static void main(String[] args) {
		
		String name = "Kancha Buddy";
		System.out.println(name);
		
		System.out.println("Length :"+name.length());
		System.out.println("Char Lenght :"+name.charAt(7));
		System.out.println("Upper Case :"+name.toUpperCase());
		System.out.println("Lower Case :"+name.toLowerCase());
		System.out.println("Add New Word :"+name.concat(" Pro Max"));
		System.out.println("Char Asky Code :"+name.codePointAt(8));
		System.out.println("Compare :"+name.compareTo("Karan Prasad"));
		System.out.println("Replace Char :"+name.replace('B', 'Y'));
		System.out.println("Replace Word :"+name.replace("Buddy", "Chinan"));
		System.out.println("Match Last Word :"+name.endsWith("Buddy"));
		
		System.out.println("\n");
		for(int i=0;i<name.length();i++)
		{
			System.out.print(name.charAt(i));
		}
		
		System.out.println("\n");
		for(int i=name.length()-1 ;i>=0 ;i--)
		{
			System.out.print(name.charAt(i));
		}
		
		
		
	}

}
