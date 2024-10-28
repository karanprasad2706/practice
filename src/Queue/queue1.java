package Queue;
import java.util.*;

public class queue1 {

    public static void main(String[] args) {
        Queue<Double> sc = new LinkedList<>();
        Scanner scc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add\n2. Remove\n3. View\n4. IsEmpty\n5. Peek\n6. Clear\n7. Exit");
            System.out.println("Choose Operation to Perform:");
            int num = scc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Add the Queue Element:");
                    double el = scc.nextDouble();
                    sc.add(el);
                    System.out.println("Added to queue");
                    break;

                case 2:
                    if (!sc.isEmpty()) {
                        sc.remove();
                        System.out.println("Removed from queue");
                    } else {
                        System.out.println("Queue is empty, nothing to remove.");
                    }
                    break;

                case 3:
                    System.out.println("Queue Elements: " + sc);
                    break;

                case 4:
                    System.out.println("Is Queue Empty: " + sc.isEmpty());
                    break;

                case 5:
                    System.out.println("Peek Element: " + (sc.isEmpty() ? "Queue is empty" : sc.peek()));
                    break;

                case 6:
                    System.out.println("Do you really want to clear queue? (Y/N)");
                    String choice = scc.next();
                    if (choice.equalsIgnoreCase("Y")) {
                        sc.clear();
                        System.out.println("Queue cleared!");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
