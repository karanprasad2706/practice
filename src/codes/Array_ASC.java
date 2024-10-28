package codes;

import java.util.*;
//import java.util.Arrays;
//import java.util.Collections;

public class Array_ASC {

    public static void main(String[] args) {

    	Integer num[] = {3, 4, 5, 42, 3, 42, 432, 44, 5};

        // Sort the array in ascending order
        Arrays.sort(num);
        System.out.println("Array in Ascending Order:\n" + Arrays.toString(num));

        // Sort the array in descending order 
        // using Collections.reverseOrder()
        Arrays.sort(num, Collections.reverseOrder());
        System.out.println("Array in Descending Order:\n" + Arrays.toString(num));
    }
}
