import java.util.*;

class Students{
    int id;
    int age;

    Students(int id, int age){        //parameterized constructor
        this.id = id;
        this.age = age;
        System.out.println("Parameterized Constructor");
        System.out.println(id);
        System.out.println(age);
    }

    Students(){
        System.out.println("Default constructor");       //default constructor
    }

    Students(int id, String name, int age){
        System.out.println("Parameterized constructor 2 with the same name but no. of arguments different");      //constructor overloading 
    }

    Students(int id, double marks){
        System.out.println("Parameterized constructor 3 with the same name, same no. of arguments but signature's(data type of arguments) are different"); //constructor overloading 
    }
}

public class constructorDemo{
    public static void main(String args[]){
        Students std1 = new Students(23,45);    //call of parameterized constructor
        Students std2 = new Students();          // this is because default constructor is called automatically
        Students std3 = new Students(1, "Rohit", 45);
        Students std4 = new Students(3, 23.3);
    }
}