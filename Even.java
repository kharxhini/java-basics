import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.Intnext();
        if(n % 2 == 0){
            System.out.println("The Number is Even:  ");
        } else {
            System.out.println("The Number is Odd: ");
        }
    }
    
}
