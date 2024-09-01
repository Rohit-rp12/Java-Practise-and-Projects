import java.util.Scanner;

public class throwsKeyword{

    public static void division(int dividend, int divisor) throws ArithmeticException{
        System.out.println("The result is: "+ dividend/divisor);
    }
    public static void main(String[] args){
        division(10,0);
    }
}