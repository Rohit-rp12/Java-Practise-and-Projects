import java.util.*;
public class max2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max;
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        System.out.println("max value is:" + max);
    }
}