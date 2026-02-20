public class PrimeRange {
    
        public static boolean isPrime(int  n){

        if(n==1){
            return false;
        }else if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n=50;
        System.out.println("Prime numbers between 1 and "+n+" are:");
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
