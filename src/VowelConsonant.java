import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a character: ");
            char c = scanner.next().charAt(0);

            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("The entered character is a vowel.");
                    break;
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("The entered character is a vowel.");
                    break;
                default:
                    System.out.println("The entered character is a consonant.");
                    break;
            }
        }



}
