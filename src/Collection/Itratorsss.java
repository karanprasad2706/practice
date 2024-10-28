package Collection;
import java.util.*;
public class Itratorsss {
	
	public static void main(String[] args) {
		
		List<Integer> l = new LinkedList();
		l.add(23);
		l.add(65);
		l.add(56);
		l.add(89);
		l.add(98);
		
		System.out.println(l);
		System.out.println();

		Iterator<Integer> i = l.iterator();
		
//		while(i.hasNext())           
//		{
//			int ii = i.next();
//			System.out.println(ii);
//			i.remove();
//		}
		
		i = l.iterator();
		
		while(i.hasNext())
		{
			int ii = i.next();
			System.out.print(ii+" ");
			if(ii==65)
			{
				i.remove();
			}
		}
		
		System.out.println("\n");
		System.out.println(l);
	}
}
