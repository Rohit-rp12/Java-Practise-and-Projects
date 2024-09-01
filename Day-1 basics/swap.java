import java.util.*;
public class swap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("before swap:-");
        System.out.println("enter value of a:-");
        a = sc.nextInt();
        System.out.println("enter value of b:-");
        b = sc.nextInt();
        a=b-a;
        b=b-a;
        a=a+b;
        System.out.println("after swap:-");
        System.out.println("value of a:-" + a);
        System.out.println("value of b:-" + b);

    }
}