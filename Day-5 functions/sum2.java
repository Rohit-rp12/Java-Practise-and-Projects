import java.util.Scanner;  

public class sum2{

    public static void calculateSum(int num1, int num2){     //no return with arguments
        int sum = num1 + num2;  
        System.out.println("Sum is = " + sum);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a65: ");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        calculateSum(a, b);       //(actual argumments)
    }
}
