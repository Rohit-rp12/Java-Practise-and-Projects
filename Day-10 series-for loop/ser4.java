import java.util.*;         //factorial series
public class ser4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
             f = f*i;
            System.out.print(f);
            System.out.print("\t");
        }
    }
}
