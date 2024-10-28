package lambda_exprestion;


import java.util.*;


public class pract1 {

	
public static void main(String[] args) {
        
        // Creating a Map to store names and ages
        Map<String, Integer> people = new LinkedHashMap<>();
        people.put("Preeti", 25);
        people.put("Mayur", 30);
        people.put("Swoaham", 28);
        people.put("Aman", 22);
        people.put("Omkar", 35);
        people.put("Shyam", 27);
        people.put("Karan", 24);
        people.put("Rishikesh", 29);
        people.put("Khushal", 26);
        
       
        System.out.println("People Map: " + people + "\n");

        // Using forEach to print greetings with name and age
        people.forEach((name, age) -> System.out.println("Hello " + name + "! You are " + age + " years old."));
    }
}
