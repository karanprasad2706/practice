package LocalDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date {
	
    public static void main(String[] args) {
//        LocalDateTime currentDateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

//        // Formatting a date-time into a string
//        String formattedDateTime = currentDateTime.format(formatter);
//        System.out.println("Formatted Date and Time: " + formattedDateTime);
//
//        // Parsing a string into a date-time
//        String dateTimeString = "03-10-2024 14:30:00";
//        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
//        System.out.println("Parsed Date and Time: " + parsedDateTime);
        
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 31);
//        Period period = Period.between(startDate, endDate);
        System.out.println("Date: " +startDate);
        System.out.println("Date: " +endDate); 

        
        Instant currentInstant = Instant.now(); 
        System.out.println("Current Instant: " + currentInstant);
        
        LocalDateTime currentDateTime = LocalDateTime.now(); 
        System.out.println("Current Date and Time: " + currentDateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2024, 10, 3, 14, 30);
        System.out.println("Specific Date and Time: " + specificDateTime);
        
        
        LocalTime currentTime = LocalTime.now();  
        System.out.println("Current Time: " + currentTime);

        LocalTime specificTime = LocalTime.of(14, 30, 45);  
        System.out.println("Specific Time: " + specificTime);
    }
}
