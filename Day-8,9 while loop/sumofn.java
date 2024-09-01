import java.util.*;
public class sumofn{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
        int n = sc.nextInt();
        int i,sum=0;
        i=1;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("the sum of series is:" + sum);
    }
}