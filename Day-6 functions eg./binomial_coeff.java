import java.util.*;
public class binomial_coeff{                     //formula for combination(P n C)  i.e n c r
    public static int fact(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static int binomialCoeff(int n,int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int binom_coeff =  fact_n/(fact_r * fact_nmr);
        return binom_coeff;
    }
    public static void main(String args[]){
        System.out.println(binomialCoeff(5,2));
    }
}