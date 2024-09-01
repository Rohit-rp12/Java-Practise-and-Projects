import java.util.*;
public class fact{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
        int n = sc.nextInt();
        int i,f=1;
        i=1;
        while(i<=n){
            f=f*i;
            i++;
        }
        System.out.println("factorial is:" + f);
    }
}