import java.util.*;     //series of square of numbers
public class ser5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i*i);
            System.out.print("\t");
        }
    }
}
