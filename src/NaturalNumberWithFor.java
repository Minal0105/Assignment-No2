import java.util.Scanner;
public class NaturalNumberWithFor {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int n = scanner.nextInt();

            // check if n is positive
            if (n <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
                return;
            }

            int sum = 0;

            // calculate the sum of the first N natural numbers using a for loop
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            // display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }


