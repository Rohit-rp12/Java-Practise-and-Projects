import java.util.*;        //example of Vehicle as Parent class and car as child class

class vehicle{
    double price;
    double mileage;
    String color;

    void display(){
        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage);
        System.out.println("Color: " + color);
    }
}

class car extends vehicle{
    String ftype;
    boolean sunroof;
    String brand;
}

public class inherit2{
    public static void main(String[] args){
        car c1 = new car();
        c1.price = 1000000;
        c1.mileage = 18.3;
        c1.color = "Red";
        c1.ftype = "Petrol";
        c1.sunroof = true;

        c1.display();
        System.out.println(c1.sunroof);
    }
}