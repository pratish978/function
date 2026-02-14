public class BinarytoDec {
    
    public static int bintoDec(int n){
        int pow=0;
        int dec=0;
        int num=n;

        while(n>0){
            int lastdigit = n%10;
            dec = dec + lastdigit*(int)Math.pow(2, pow);
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of" + num + " is "+ dec);
        return dec;
    }

    public static void main(String[] args) {
        bintoDec(101);
    }
}
