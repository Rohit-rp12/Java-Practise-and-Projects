import java.util.*;

class parentClass{
    void display(){
        System.out.println("Parent Class method called ");
    }
}

class childClass extends parentClass{
    void show(){
        System.out.println("Child class method called");
    }
}
public class inherit{
    public static void main(String[] args){
        childClass c1 = new childClass();
        c1.display();
        c1.show();
    }
}