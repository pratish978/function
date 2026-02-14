import java.util.*;

public class Palindrome {
    
    public static void main(String[] args) {
        System.out.println("Please Enter a number :");
        Scanner sc=new Scanner(System.in);
        int palindrome=sc.nextInt();
        
        if(isPalindrome(palindrome)) {
            System.out.println("Number : "+palindrome+" is a palindrome");
        }else{
            System.out.println("Number : "+palindrome+" is not a palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        while(number>0){
            int digit=number%10;
            reverse=reverse*10+digit;
            number=number/10;
        }
        if(originalNumber == reverse){
            return true;
        }else{
            return false;
        }
    }
}
