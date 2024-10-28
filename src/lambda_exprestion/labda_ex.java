package lambda_exprestion;

import java.util.*;

public class labda_ex {

	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("Preeti","Mayur","Swoaham","Aman","Omakar","Shyam","Karan","Rishikesh","Khushal");
		System.out.println(name+"\n");
		
		name.forEach(names -> System.out.println("Hello ::: "+names));
		
		
		
		
		//java.util.Arrays$ArrayList cannot be cast to class java.util.Set
		
//		Set <String> ss = (Set <String>) Arrays.asList("a1","a2","a3","a4","a5","a6");
//		ss.forEach(s -> System.out.println("Hello ::: "+s));
		
		
	}
	
}
