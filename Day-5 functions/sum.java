import java.util.Scanner;

public class sum{

    public static void calculateSum(){      //no return no arguments
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a65: ");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is = " + sum);
    
    }
    public static void main(String[]args){
        calculateSum();
    }
}
