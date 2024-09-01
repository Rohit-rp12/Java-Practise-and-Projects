import java.util.*;
public class linearSearch{

    public static int ls(int numbers[], int key){            //linear search example when array input and key already provided in code
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,5,7,9,36,76};
        int key = 9;

        int index = ls(numbers, key);
        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index: " + index);
        }
    }
    
}