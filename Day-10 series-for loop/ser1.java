import java.util.*;
public class ser1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i);
            System.out.print("\t");
        }
    }
}