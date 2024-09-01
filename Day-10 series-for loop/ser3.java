import java.util.*;  //odd number series
public class ser3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        int k=1;
        for(int i=1;k<=n;i = i+2){
            System.out.print(i);
            System.out.print("\t");
            k++;
        }
    }
}