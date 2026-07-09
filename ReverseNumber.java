import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int rev = 0;

        while (n != 0) {

            int digit = n % 10;      // Get the last digit

            rev = rev * 10 + digit;  // Add the digit to the reversed number

            n = n / 10;              // Remove the last digit
        }

        System.out.println("Reversed Number: " + rev);

        sc.close();
    }
}