package LinkedHashMap;
import java.util.*;

public class peogram1 {

	public static void main(String[] args) {
		
		Map <Integer,String> m = new LinkedHashMap();
		System.out.println(m);
		
		m.put(2, "Kancha");
		m.put(1, "Chinna");
		m.put(3, "Baban");
		m.put(5, "Billa");
		m.put(6, "Rathe");
		m.put(4, "Matawarlal");
		
		System.out.println("Contains Key :"+ m.containsKey(5));
		
		System.out.println("Contains Value :"+ m.containsValue("Chinna"));
		System.out.println(m+" size :"+ m.size());
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		System.out.println(m + "\n\n" + m.getClass()+"\n\n");
		
		Map <Integer , String> h = new HashMap(m);
		System.out.println(h + "\n" +h.getClass()+ "\n\n");
		
		Map <Integer , String> t = new TreeMap(m);
		System.out.println(t + "\n" +t.getClass()+ "\n\n");

		for(Map.Entry<Integer, String> e:m.entrySet())
		{
			System.out.println(e.getKey()+" :: " +e.getValue());
		}
		
		
	}
	
	
}
