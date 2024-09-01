import java.util.*;

import javax.swing.plaf.synth.SynthPasswordFieldUI;
public class primeno{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int f = 1;
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int i = 2;
        while(i<=n/2){
            if(n%i==0){
                f=0;
                break;
            }
            i++;
        }
        if(f==1){
            System.out.println("no is prime");
        }
        else{
            System.out.println("no is not prime");
        }
    }
}