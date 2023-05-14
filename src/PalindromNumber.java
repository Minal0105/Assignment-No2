import java.util.Scanner;
public class PalindromNumber {
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
            int originalNum = n;

            // reverse the number using a for loop
            for (; n != 0; n /= 10) {
                int digit = n % 10;
                reversedNum = reversedNum * 10 + digit;
            }

            // check if the original number and reversed number are the same
            if (originalNum == reversedNum) {
                System.out.println("The input number is a palindrome.");
            } else {
                System.out.println("The input number is not a palindrome.");
            }
        }
    }


