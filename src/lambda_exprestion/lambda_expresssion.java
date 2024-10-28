package lambda_exprestion;

import java.util.Scanner;

@FunctionalInterface
interface Addition {
    int add(int a, int b);
}

@FunctionalInterface
interface Subtract {
    int sub(int a, int b);
}

@FunctionalInterface
interface Multiply {
    int mul(int a, int b);
}

@FunctionalInterface
interface Division {
    int div(int a, int b);
}

public class  lambda_expresssion{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Operation: 1. Add 2. Subtract 3. Multiply 4. Divide ");
        int option = sc.nextInt();

        switch (option) {

            case 1:
                Addition addition = (f, g) -> f + g;
                System.out.println("Addition: " + addition.add(200, 982));
                break;

            case 2:
                Subtract subtract = (a, g) -> a - g;
                System.out.println("Subtraction: " + subtract.sub(200, 982));
                break;

            case 3:
                Multiply multiply = (s, g) -> s * g;
                System.out.println("Multiplication: " + multiply.mul(200, 982));
                break;

            case 4:
                Division division = (t, y) -> {
                    if (y == 0) {
                        throw new IllegalArgumentException("Division by zero is not allowed.");
                    }
                    return t / y;
                };
                System.out.println("Division: " + division.div(200, 10));
                break;

            default:
                System.out.println("Invalid option selected.");
                break;
        }

        sc.close();
    }
}
