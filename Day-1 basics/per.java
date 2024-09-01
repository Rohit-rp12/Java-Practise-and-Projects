import java.util.*;
public class per{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of 1st subject:");
        int a = sc.nextInt();
        System.out.println("enter marks of 2nd subject:");
        int b = sc.nextInt();

        int p = (a+b)*100/200;
        System.out.println("percentage is :" + p);
    }
}