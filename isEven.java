import java.util.*;

public class isEven {
     
    public static boolean Even(int n){

        if (n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();

        if(Even(n)){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
