package StopWatch;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Stopwatch {
    
    private LocalTime startTime;
    private Duration elapsedDuration = Duration.ZERO;
    private boolean isRunning = false;

    public void start() {
        if (!isRunning) {
            startTime = LocalTime.now();
            isRunning = true;
            System.out.println("Stopwatch started...");
        } else {
            System.out.println("Stopwatch is already running.");
        }
    }

    public void pause() {
        if (isRunning) {
            elapsedDuration = elapsedDuration.plus(Duration.between(startTime, LocalTime.now()));
            isRunning = false;
            System.out.println("Stopwatch paused.");
        } else {
            System.out.println("Stopwatch is not running.");
        }
    }

    public void reset() {
        elapsedDuration = Duration.ZERO;
        isRunning = false;
        System.out.println("Stopwatch reset.");
    }

    public void restart() {
        reset();
        start();
        System.out.println("Stopwatch restarted.");
    }

    public void elapsed() {
        Duration totalElapsed = elapsedDuration;
        if (isRunning) {
            totalElapsed = totalElapsed.plus(Duration.between(startTime, LocalTime.now()));
        }
        System.out.println("Elapsed time: " + formatDuration(totalElapsed));
    }

    private String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        long secs = seconds % 60;
        long millis = duration.toMillisPart();
        
        return String.format("%02d:%02d:%02d.%03d", hours, minutes, secs, millis);
    }

    public void exit() {
        System.out.println("Exiting stopwatch...");
        System.exit(0);
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nStopwatch Menu:");
            System.out.println("1. Start");
            System.out.println("2. Pause");
            System.out.println("3. Restart");
            System.out.println("4. Reset");
            System.out.println("5. Elapsed");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    stopwatch.start();
                    break;
                case 2:
                    stopwatch.pause();
                    break;
                case 3:
                    stopwatch.restart();
                    break;
                case 4:
                    stopwatch.reset();
                    break;
                case 5:
                    stopwatch.elapsed();
                    break;
                case 6:
                    stopwatch.exit();
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

