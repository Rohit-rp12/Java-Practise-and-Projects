import java.util.*;
public class  max3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values of a,b and c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max=a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println("the max value is :" + max);

    }
}
//logic 2nd using else if
/*if(a>b && a>c) 
        max = a;
    else if(b>a && b>c)
        max = b;
    else
        max = c; */

