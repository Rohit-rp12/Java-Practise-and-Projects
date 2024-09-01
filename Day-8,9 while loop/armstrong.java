import java.util.*;
public class armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the number:");
        int num = sc.nextInt();
        int d,sum=0,count=0,x;
        x=num;
        while(num>0){
            num = num/10;
            count++;
        }
        num=x;
        while(num>0){
            d = num%10;
            int i=1,ans=1;
            for(i=1;i<=count;i++){
                ans = ans*d;
            }
            sum = sum + ans;
            num = num/10;
        }
        if(sum==x){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}