import java.util.*;

public class throwKeyword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age<18){
            throw new RuntimeException("Sorry can't vote!!!");
        }
        else{
            System.out.println("You're eligible to vote!!!");
        }

    }
}