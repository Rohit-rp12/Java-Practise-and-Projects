import java.util.*;

class customer{
    String name;
    int pin;
    int acc_balance;

    public void withdraw(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn:");
        int wamount = read.nextInt();
        if(wamount>acc_balance){
            System.out.println("Insufficient balance");
        }
        else if(wamount == acc_balance){
            System.out.println("You cannot keep null balance in your account");
        }
        else{
            acc_balance = acc_balance - wamount;
            System.out.println("Amount Withdrawn Successfully!!");
            System.out.println("Your current balance as of now is:" + acc_balance);
        }
       
    }

    public void deposit(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited:");
        int damount = read.nextInt();
        acc_balance = acc_balance + damount;
        System.out.println("Amount deposited Successfully!!");
        System.out.println("Your current balance as of now is:" + acc_balance);
    }
      
}

public class atm{
    public static void main(String args[]){
        customer c1 = new customer();
        c1.name = "Rohit";
        c1.pin = 6721;
        c1.acc_balance = 50000;

        System.out.println("Enter your pin:-");
        Scanner sc = new Scanner(System.in);
        int cpin = sc.nextInt();
            if(cpin == c1.pin){
                System.out.println("Welcome to Au Bank ATM services!!");
                System.out.println("Chose from the following service:-");
                System.out.println("1. Check Account Balamce:");
                System.out.println("2. Withdraw Money:");
                System.out.println("3. Deposit Money:");
                System.out.println("4. Exit:");
                int service = sc.nextInt();
                    switch(service){
                        case 1 : System.out.println(c1.acc_balance);
                        break;
        
                        case 2 : c1.withdraw();
                        break;
        
                        case 3 : c1.deposit();
                        break;
        
                        case 4 :  System.out.println("Thank you for using AU Bank ATM services!!");
                        break;
                        default : System.out.println("Invalid option selected:");
                    }
                

    
            }
            else{
                System.out.println("Wrong pin entered");
            }
        
       

    }
}

