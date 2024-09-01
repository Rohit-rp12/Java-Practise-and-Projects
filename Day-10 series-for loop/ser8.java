import java.util.*;
public class ser8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        int k=1;
        for(int i=1;k<=n;k++){
            System.out.println(i);
            if(i%2==0){
                i = i+1;
            }
            else{
                i = i+3;
            }
        }
    }
}
