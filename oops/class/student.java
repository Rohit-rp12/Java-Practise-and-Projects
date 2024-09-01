import java.util.*;
public class student{       //class creation
    String name;            // blueprint of behaviour/properties of object
    int roll_no;

    public void printdata(){               //class method(functions inside class) to print properties of object
        System.out.println(name);
        System.out.println(roll_no);
    }

public static void main(String[] args){
    student std1 = new student();         //object creation
    std1.name = "Rohit";                  //object accessing its properties stored inside class 
    std1.roll_no = 49;
    System.out.println(std1.name);    
    
    student std2 = new student();      //2nd object
    std2.name = "Suraj";
    std2.roll_no = 46;
    std2.printdata();      //this time we using funnction to print properties of 2nd object 
    std1.printdata();      //objects can access both variables and functions created inside class(known as methods)
   
}
}