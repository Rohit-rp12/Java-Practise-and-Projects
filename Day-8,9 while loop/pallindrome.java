import java.util.*;
public class pallindrome{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int rev=0,d,x;
        x=num;
        while(num>0){                 //logic for reversing a number
            d = num%10;
            rev = rev*10 + d;
            num = num/10;
        }
        System.out.println("the reverse of number is:" + rev);
        if(x==rev){                     //for checking pallindrome
            System.out.println("number is pallindrome");  
        }
        else{
            System.out.println("no is not pallindrome");
        }
    }
}