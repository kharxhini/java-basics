import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int n = sc.nextInt();
         
    int rev = 0;

        while(n != 0){
            int number = n % 10;
            rev = rev * 10 + number;
            n = n/10;
        }
        System.out.println(rev);
    }
}