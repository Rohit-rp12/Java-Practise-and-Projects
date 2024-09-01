import java.util.*;
public class numinwords{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int rev=0,d;
        while(num>0){
        d = num%10;
        rev = rev*10 + d;
        num = num/10;
        }
        System.out.println("the reverse of a number is:" + rev);
        num = rev;
        while(num>0){
            d = num%10;
            switch(d){
                case 0: System.out.println("Zero");
                break;
                case 1: System.out.println("One");
                break;
                case 2: System.out.println("Two");
                break;
                case 3: System.out.println("Three");
                break;
                case 4: System.out.println("Four");
                break;
                case 5: System.out.println("Five");
                break;
                case 6: System.out.println("Six");
                break;
                case 7: System.out.println("Seven");
                break;
                case 8: System.out.println("Eight");
                break;
                case 9: System.out.println("Nine");
            }
            num = num/10;
        }

    }
}