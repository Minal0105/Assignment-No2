import java.util.Scanner;

public class SingleDigitInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no");
        int n = scanner.nextInt();
        if(n==0){
            System.out.println("Zero");
        }else if (n==1) {
            System.out.println("One");
        }else if (n==2) {
            System.out.println("Two");
        }else if (n==3) {
            System.out.println("Three");
        }else if (n==4) {
            System.out.println("Four");
        }else if (n==5) {
            System.out.println("Five");
        }else if (n==6) {
            System.out.println("Six");
        }else if (n==7) {
            System.out.println("Seven");
        }else if (n==8) {
            System.out.println("Eight");
        }else if (n==9) {
            System.out.println("Nine");
        }else{
            System.out.println("sorry this is not a single digit no.");
        }
    }
}

