import java.util.Scanner;  

public class sum4{

    public static int calculateSum(){     // return with no arguments
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a65: ");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        
        
        int sum = a+b;  
        return sum;
    }
    public static void main(String[]args){
        int sum = calculateSum();
        System.out.println("The sum is = " + sum);
    }
}