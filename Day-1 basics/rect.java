import java.util.*;
public class rect{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of rectangle:-");
        int l = sc.nextInt();
        System.out.println("Enter breadth of rect:-");
        int b = sc.nextInt();
        int a = l*b;
        int p = 2*(l+b);
        System.out.println("the area of rect is " + a);
        System.out.println("the perimeter of rect is" + p);
    }
}