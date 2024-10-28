package encapsulation;

import java.util.Scanner;

public class UserData {

    public static void main(String[] args) {
        
        User user = new User();

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Username :");
        String name = s.next();
        user.setUsername(name);
        
        System.out.println("Enter Password :");
        String pass = s.next();
        user.setPassword(pass);
        
        System.out.println("Enter Email :");
        String email = s.next();
        user.setMail(email);
        
        System.out.println("Enter Contact :");
        String contact = s.next();
        user.setContact(contact);
        
        System.out.println("Enter Address :");
        String address = s.next();
        user.setAddress(address);
        
        System.out.println("Enter Age :");
        String age = s.next();
        user.setAge(age);
        
        System.out.println("Enter Gender :");
        String gender = s.next();
        user.setGender(gender);
        
        System.out.println("Enter Occupation :");
        String occupation = s.next();
        user.setOccupation(occupation);
        
        System.out.println("\t\t\t==========================");
        System.out.println("\t\t\t  Welcome to Coding Ninjas");
        System.out.println("\t\t\t==========================\n");

        System.out.println("\t\tOrganization Name  : Coding Ninjas");
        System.out.println("\t\tCourse Offerings   : Programming, Web Development, Data Science, AI, Machine Learning");
        System.out.println("\t\tInstructors        : Expert Coders from Industry");
        System.out.println("\t\tLocation           : Online");
        System.out.println("\t\tSupport            : 24/7 Mentor Support");
        System.out.println("\t\tPlatform Features  : Interactive Learning, Real-World Projects, CodePlayground");
        System.out.println("\t\tPopular Courses    : Java, Python, C++, Data Structures & Algorithms");
        System.out.println("\t\tWebsite            : www.codingninjas.com");

        System.out.println("\n\t\t\t==========================");
        System.out.println("\t\t\t      Happy Coding!");
        System.out.println("\t\t\t==========================");

        
        System.out.println("\n\t\t\t\tUser Information\n");
        System.out.print("Username    : " + user.getUsername());
        System.out.print("\t\t\t\t\tPassword    : " + user.getPassword()+"\n");
        System.out.print("Email       : " + user.getMail());
        System.out.print("\t\t\t\t\tContact     : " + user.getContact()+"\n");
        System.out.print("Address     : " + user.getAddress());
        System.out.print("\t\t\t\t\tAge         : " + user.getAge()+"\n");
        System.out.print("Gender      : " + user.getGender());
        System.out.print("\t\t\t\t\tOccupation  : " + user.getOccupation()+"\n");

        s.close();
    }
}
