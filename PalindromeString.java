import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your String: ");
  
        String name = sc.next();
        String org_name = name;

        String rev = "";

        int len = name.length();

        for(int i=len-1;i >=0; i--){
            rev = rev+name.charAt(i);
        }
        if ( org_name.equals(rev)){
            System.out.println("This is Palindrome");
        }else{
            System.out.println("This is not a Palindrome");
        }
    }
    
}
