import java.util.Scanner;  

public class sum3{

    public static int calculateSum(int num1, int num2){     // return with arguments  here num1 and num2 are called parameters or formal arguments
       int sum = num1 + num2;  
       return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a65: ");
        int a = sc.nextInt();           
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);                 // here a and b are called arguments (actual argumments)
        System.out.println("The sum is = " + sum);
        
    }
}
