package LinkedHashSET;

import java.util.*;
import java.util.Set;

public class prog3 {
	
	public static void main(String[] args) {
		
		List<prog2> stt = new Vector<>();
		stt.add(new prog2(1, "Kancha"));
        stt.add(new prog2(2, "China"));
        stt.add(new prog2(3, "Mogamboo"));
        stt.add(new prog2(4, "Kala"));
        stt.add(new prog2(4, "Kala"));  

        for (prog2 st : stt) {
            System.out.println(st);
        }
        
        System.out.println(stt.size());

        prog2 search = new prog2(2, "China");
        System.out.println(stt.contains(search));
        
        if (stt.contains(search)) {
            System.out.println("Student Is Present In Set");
        } else {
            System.out.println("Not Present In Set");
        }
        
        System.out.println(stt.remove(search));
        
        for (prog2 st : stt) {
            System.out.println(st);
        }
		
	}

}
