import java.util.*;
public class sumdigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        int d,sum=0;
        while(num>0){
            d = num%10;
            sum = sum + d;
            num = num/10;
        }
        System.out.println("the sum of digits is =" + sum);
    }
}