import java.util.Scanner;
public class ReverseNumber {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int n = scanner.nextInt();

            // check if n is positive
            if (n <= 0) {
                System.out.println("Invalid input Please enter a positive integer.");
                return;
            }

            int reversedNum = 0;

            // reverse the number using a while loop
            while (n > 0) {
                int digit = n % 10;
                reversedNum = reversedNum * 10 + digit;
                n /= 10;
            }

            // display the result
            System.out.println("The reverse of the input number is: " + reversedNum);
        }
    }


