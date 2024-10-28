package Collection;

import java.util.*;

public class listItretorss {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        
        ListIterator<Integer> l = list.listIterator();
        
        // Forward Traversal
        System.out.println("Forward List:");
        
        while (l.hasNext()) 
        {
            int var = l.next();
            System.out.print(var + " ");
        }
        
        // Backward Traversal
        System.out.println("\nBackward List:");
        
        while (l.hasPrevious()) 
        {
            int var2 = l.previous();
            System.out.print(var2 + " ");
        }
        
        // Resetting the iterator to the start of the list
        l = list.listIterator();
        
        System.out.println("\n\nChanging Value in the List (Replace 30 with 35):");
        
        while (l.hasNext()) 
        {
            int var = l.next();
            if (var == 30) 
            {
                l.set(35000000);
            }
        }

        
        // Printing the updated list as individual elements
        System.out.println("Updated List: ");
        for (Integer i : list) 
        {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
