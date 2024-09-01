import java.util.*;
public class primefactors{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
        int n = sc.nextInt();
        int i = 2;
        while(n!=1){
            if(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            else{
                i++;
            }
        }

    }
}