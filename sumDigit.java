import java.util.*;

public class sumDigit {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();

        System.out.println("Sum of digits of "+n+" is "+sum(n));
    }

    public static int sum(int n){
        int sum=0;

        while(n>0){
            int LastDigit=n%10;
            sum=sum+LastDigit;
            n=n/10;
        }
        return sum;
    }
}
