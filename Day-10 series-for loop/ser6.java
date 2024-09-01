import java.util.*;             //table of any no. till 10
public class ser6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
}
