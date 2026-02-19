import java.util.*;

public class Parameter {//Parameter :- Input


    public static int CalSum(int a,int b){//Parameters or formal Parameters.
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=CalSum(a,b);//Arguments or Actual Paramters.
        System.out.println("Sum is "+ sum);
    }
}
