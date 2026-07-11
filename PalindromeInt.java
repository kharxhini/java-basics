import java.util.Scanner;
public class PalindromeInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n  = sc.nextInt();
        int org = n;
        int rev = 0;

        while(n != 0){
            int digit = n % 10;
            rev = rev*10+digit;
            n = n/10;
        }
       if ( org == rev){
        System.out.println("This is palindrome");
       }else{
        System.out.println("This is not a palindrome");
       }

        
    }
}