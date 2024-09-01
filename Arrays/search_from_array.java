import java.util.*;  //take an array as i/p from the user. Search for a given number x and print the index at which it occurrs.

public class search_from_array{      //linear search example when array and key are taken as i/p from the user 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<numbers.length; i++){    //using .length gets us the size of an array
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the no. to be searched in array");
         int x = sc.nextInt();

        //output
        boolean found = false;
        for(int i=0; i<numbers.length; i++){
            
            if(numbers[i] == x){
                System.out.println(x + " found at index " + i);
                found = true;
                break;
            }
        }
        if(!found){  //This checks if the found variable is still false after the loop has completed. If found is false, it means that the element x was not found in the array
            System.out.println(x + " not found in the array.");
        }

       
        sc.close();
        
        
    }
}