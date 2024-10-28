package wrapper_class;

import java.util.*;
public class stackk {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
	       Scanner c = new Scanner(System.in);
	       do
	       {
	           System.out.println("1.Push 2.pop 3.clear 4.isempty 5.peek 6.exit 7.view");
	           System.out.println("Enter operation to be performed on stack:");
	           int op = c.nextInt();
	           switch(op)
	           {
	           case 1: System.out.println("Enter element: ");
	                   int el = c.nextInt();
	                   s.push(el);
	                   System.out.println("Added to stack !");
	                   break;
	                   
	           case 2: s.pop();
	                System.out.println("Removed from stack !");
	                break;
	               
	           case 3: System.out.println("Do you really want to clear stack: ");
	            String choice = c.next();
	            if(choice.equals("yes"))
	            {
	               s.clear();
	               System.out.println("Stack cleared");
	            }
	            break;
	           case 4: System.out.println("Is stack empty: "+s.empty()); break;
	           case 5: System.out.println("Peek element: "+s.peek()); break;
	           case 6: System.exit(0); System.out.println("Stack terminated !"); break;
	           case 7: System.out.println(s);
	           }
	           
	       }while(true);
	       
	       
	       

	   
	}
}
