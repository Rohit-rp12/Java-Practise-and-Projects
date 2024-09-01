import java.util.*;

public class ArraysCC{
    public static void main(String args[]){
        // creating an array
        //int marks[] = new int[50];
        int numbers[] = {1,2,3};    // declare and intitialization of an array together
        String fruits[] = {"apple","orange","pomegranate"};
        System.out.println(fruits[0]);
        fruits[1] = "mango";    //update an element in an array
        System.out.println(fruits[1]);

        int marks[] = new int[3];   //declare an arrya
        marks[0] = 99; //maths     //initialization of an array
        marks[1] = 97; //science
        marks[2] = 93; //english 

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks);   // will print jargin or garbage value (jaha pr array ke data pda he us address se related value print krega)

        System.out.println("Using for loop no need to write print statements again");

      

       

        for(int i=0; i<3; i++){  //output no need to write print statements again
            System.out.println(marks[i]);
        }
    }

}