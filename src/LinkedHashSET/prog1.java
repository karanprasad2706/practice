package LinkedHashSET;
import java.util.*;
public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set s = new LinkedHashSet();
		
		s.add(23);
		s.add(43);
		s.add(84);
		s.add(56);
		s.add(54);
		s.add(89);
		
		System.out.println(s);
		
		Set sc = new HashSet(s);
		
		System.out.println(sc);
		
		Set scc = new TreeSet(s);
		
		System.out.println(scc);
	}

}
