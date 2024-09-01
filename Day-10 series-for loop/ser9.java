import java.util.*;     //series of square of numbers
public class ser9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        int a=0,b=1;
        int c;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a=b;
            b=c;
        }
    }
}

