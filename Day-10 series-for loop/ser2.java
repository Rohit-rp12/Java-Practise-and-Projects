import java.util.*;  //even number series
public class ser2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        int k=1;
        for(int i=0;k<=n;i = i+2){
            System.out.print(i);
            System.out.print("\t");
            k++;
        }
    }
}