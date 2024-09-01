import java.util.Scanner;

public class ExceptionDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        try{
            int result = dividend/divisor;
            System.out.println("Your answer is: "+ result);
        }catch(ArithmeticException e){  //Arithmetic Exception is a class and e is object of that class
            //System.out.println(e.getMessage());  //getMessage is a method that gets us default message from the exception class 
            System.out.println("Divisor can't be zero!!");       
        }
    }
}