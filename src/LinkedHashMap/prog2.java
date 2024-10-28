package LinkedHashMap;
import java.util.*;

public class prog2 {

    public static void main(String[] args) {
        
        // Create a Map To hold correct answers
        Map<String, String> correctAnswers = new LinkedHashMap<>();
        
        // Create a Map to hold questions with options
        Map<String, List<String>> questions = new LinkedHashMap<>();
        
        questions.put("Select which is not the type of Inheritance in Java.", 
                Arrays.asList("A. Multilevel", "B. Multiple", "C. Hierarchical", "D. Single"));
        correctAnswers.put("Select which is not the type of Inheritance in Java.", "C. Hierarchical");
        
        questions.put("Who is the Best Singer?", 
                Arrays.asList("A. Beyonce", "B. Harry Styles", "C. Charlie Puth", "D. Michael Jackson"));
        correctAnswers.put("Who is the Best Singer?", "D.Michael Jackson");
        
        questions.put("String is ________?", 
                Arrays.asList("A. Mutable", "B. Immutable", "C. Double", "D. Single"));
        correctAnswers.put("String is ________?", "B.Immutable");
        
        questions.put("When was Java created?", 
                Arrays.asList("A. 1995", "B. 2005", "C. 1993", "D. 1990"));
        correctAnswers.put("When was Java created?", "A.1995");
        
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Quiz! 🎉");
        System.out.println("=========================");
        
        for (Map.Entry<String, List<String>> entry : questions.entrySet()) {
            String question = entry.getKey();
            List<String> options = entry.getValue();
            
            // Display question
            System.out.println("\n" + question);
            
            // Display options
            for (String option : options) {
                System.out.println(option);
            }
            
            // Get user's answer
            System.out.print("\nYour Answer (A/B/C/D): ");
            String userAnswer = scanner.next().toUpperCase();
            
            // Get the correct answer
            String correctAnswer = correctAnswers.get(question);
            
            // Check if user's answer is correct
            if (correctAnswer.startsWith(userAnswer)) {
                System.out.println("✅ Correct Answer! 🎉");
                score++;
            } else {
                System.out.println("❌ Wrong Answer! The correct answer is: " + correctAnswer);
            }
        }
        
        // Final score
        System.out.println("\n=========================");
        System.out.println("Your Total Score: " + score + "/" + questions.size());
        
        // Calculate percentage
        double percentage = (double) score / questions.size() * 100;
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        
        // Feedback based on score
        if (percentage == 100) {
            System.out.println("🏆 Excellent! You got all the answers right!");
        } else if (percentage >= 75) {
            System.out.println("👍 Great job! You have a strong understanding.");
        } else if (percentage >= 50) {
            System.out.println("🙂 Good effort, but keep practicing.");
        } else {
            System.out.println("😐 Don't worry, keep learning and you'll improve!");
        }
    }
}
