public class DecimaltoBin {
    
    public static int decToBin(int n){
        int pow=0;
        int bin=0;
        int num=n;

        while(n>0){
            int rem = n%2;
            bin = bin + rem*(int)Math.pow(10, pow);
            pow++;
            n=n/2;
        }
        System.out.println("Binary of " + num + " is "+ bin);
        return bin;
    }

    public static void main(String[] args) {
        decToBin(5);
    }
}
