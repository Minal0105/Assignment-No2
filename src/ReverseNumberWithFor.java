
import java.util.Scanner;
public class ReverseNumberWithFor {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int n = scanner.nextInt();

            // check if n is positive
            if (n <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
                return;
            }

            int reversedNum = 0;

            // reverse the number using a for loop
            for (; n != 0; n /= 10) {
                int digit = n % 10;
                reversedNum = reversedNum * 10 + digit;
            }

            // display the result
            System.out.println("The reverse of the input number is: " + reversedNum);
        }
    }


