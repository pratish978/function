import java.util.*;

public class Product1{

    public static int prod(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=prod(a,b);
        System.out.println("Product is: "+result);
    }
}