import java.util.*;

public class Arrays{      // for taking i/p and o/p from user using for loop
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        //output
        for(int i=0; i<size; i++){
            System.out.print(numbers[i]);
            System.out.print("\t");
        }
    }
}