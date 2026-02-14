public class Binomial {

    public static int fact(int n){
    int f=1;

    for(int i=1;i<=n;i++){
        f = f * i;
    }
    return f;
    }

    public static int Bino(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_n_r=fact(n-r);

        int bino=fact_n/(fact_r*fact_n_r);
        return bino;
    }

    public static void main(String[] args) {
        int n=5;
        int r=2;
        System.out.println(Bino(n,r));
    }
    
}


// Formula :- n in upper C  r in down=n!/((n-r)!*r!)