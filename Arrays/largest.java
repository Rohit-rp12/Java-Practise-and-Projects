import java.util.*;
public class largest{

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;      //used to denote -infinity in java
        int smallest = Integer.MAX_VALUE;     //used to denote +infinity in java

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }

        }
        System.out.println("The smallest number is: " + smallest);
        return largest;
    }
    public static void main(String args[]){
        //int numbers[] = {2,4,0,9,6};      //use it for i/p alread in code then ignore below part which takes i/p from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<numbers.length; i++){    //using .length gets us the size of an array
            numbers[i] = sc.nextInt();
        }

        System.out.println("The largest number is: " + getLargest(numbers));
    }
}