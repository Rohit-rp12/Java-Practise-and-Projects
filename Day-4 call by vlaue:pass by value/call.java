import java.util.*;

public class call{
    public static void swap(int a, int b){      //parameters or formal parameters
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);    //call by value in java means that a variable created inside a function has its scope in that function only.(retains its original value inside function only)
        System.out.println(b);    //if these two print statements are written inside main function then actual values will not be swapped.
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 10;
        swap(a,b);                //arguments or actual parameters
        
    }
}