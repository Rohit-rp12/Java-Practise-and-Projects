import java.util.*;
public class sumndif{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
        int n = sc.nextInt();
        int i,num,sum=0;
        i=1;
        while(i<=n){
            System.out.println("enter the number:");
            num = sc.nextInt();
            sum = sum + num;
            i++;
        }
        System.out.println("The sum of n different numbers is:" + sum );
    }
}