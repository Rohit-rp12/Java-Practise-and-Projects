import java.util.*;
public class swap1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("before swap:");
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("after swap:");
        System.out.println("value of a is =" + a);
        System.out.println("value of b is ="+ b);
    }
}