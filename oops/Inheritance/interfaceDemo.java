import java.util.*;
interface Car{                     //interface named Car
    public void start();           // abstract method declaration(has no body)
}

class electricCar implements Car{          // class electricCar wants to implement Car interface    
    public void start(){
        System.out.println("Electric car starts!");
    }
}

class dieselCar implements Car{
    public void start(){
        System.out.println("Diesel car starts!");
    }
}

public class interfaceDemo{
    public static void main(String[] args){
        Car Tesla = new electricCar();            
        Car XUV700 = new dieselCar();

        Tesla.start();
        XUV700.start();
        }   
}


