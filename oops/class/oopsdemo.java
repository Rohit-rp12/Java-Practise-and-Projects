import java.util.*;

class student{
    String name;
    int roll_no;
    String address;
    final String sname = "St. Paul's";  //school name , using final keyord because i want to keep this value same throughout the program
}

public class oopsdemo{
    public static void main(String args[]){
        student std1 = new student();
        std1.name = "Riya";
        System.out.println(std1.name);
        System.out.println(std1.sname);

        std1.name = "Tanya";
        System.out.println(std1.name);      //value of riya will get overwrite
        System.out.println(std1.sname);

        student std2 = new student();
        std2.name = "Rohit";
        System.out.println(std2.name);     // name variable is assigned separately to each object. Therefore the value didn't overwrite the name of object 1.
        System.out.println(std2.sname);

        // std1.sname = "Station";  // will throw error because u cannot assign value to kewyord final
        
    }
}