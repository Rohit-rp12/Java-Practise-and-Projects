import java.util.*;
public class money{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int m,a,b,c,d,e,f,g,h,i;
        System.out.println("enter the total amount:");
        m = sc.nextInt();

        a = m/2000;
        m = m%2000;

        b = m/500;
        m = m%500;
        
        c = m/100;
        m = m%100;

        d = m/50;
        m = m%50;

        e = m/20;
        m = m%20;

        f = m/10;
        m = m%10;

        g = m/5;
        m = m%5;

        h = m/2;
        m = m%2;

        i = m/1;
        m = m%1;

        System.out.println("The denominations of the amount given are =\n" + "2000 notesa:"+a+"\n 500 notes:"+b+"\n 100 notes:"+c+"\n50 notes:"+d+"\n20 notes:"+e+"\n10 notes:"+f+"\n5 notes:"+g+"\n2 notes:"+h+"\n1 notes:"+i);

      


    }
}
