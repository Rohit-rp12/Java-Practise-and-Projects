import java.util.*;
public class maxmindigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =  sc.nextInt();
        int max=0,min=0,d;
        max = num%10;
        min = num%10;
        while(num>0){
            d = num%10;
            if(d>max){
                max=d;
            }
            else{
                min=d;
            }
            num = num/10;
        }
        System.out.println("The max digit is = " + max);
        System.out.println("The min digit is =" + min);
    }
}