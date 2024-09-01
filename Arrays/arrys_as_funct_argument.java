import java.util.*;
public class arrys_as_funct_argument{

    public static void update(int marks[], int interchangeable){        //funct. to update marks by 1
        for (int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
            interchangeable = 10;
        }

    }

    public static void main(String args[]){
        int marks[] = {56,90,85};
        int interchangeable = 5;   // a variable
        update(marks,interchangeable);
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i] + "\t");
        }
        System.out.println("");
        System.out.println(interchangeable);     // we observe value remains same as arrays are passed by reference therefore
                                                 // changes made in function reflects in main too
                                                 // but in case of variables it doesn't.
    }
}