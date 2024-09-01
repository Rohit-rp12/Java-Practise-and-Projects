import java.util.*; //count digits of a number
public class count{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("no. of digits:" + count);

    } 
}