import java.util.Scanner;
public class NaturalNumberSum {
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
            int i = 1;

            // calculate the sum of the first N natural numbers
            while (i <= n) {
                sum += i;
                i++;
            }

            // display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }


