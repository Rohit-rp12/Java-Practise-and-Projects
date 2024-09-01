import java.sql.SQLOutput;
import java.util.Scanner;

public class Cars extends Showroom implements utility{
    String car_name;
    String car_color;

    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;       //automatic or manual

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("========================= *** ENTER CAR DETAILS *** =========================");
        System.out.println();
        System.out.println("CAR NAME: ");
        car_name = sc.nextLine();
        System.out.println("CAR COLOR: ");
        car_color = sc.nextLine();
        System.out.println("CAR FUEL TYPE(DIESEL/PETROL): ");
        car_fuel_type = sc.nextLine();
        System.out.println("CAR PRICE: ");
        car_price = sc.nextInt();
        System.out.println("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        car_type = sc.nextLine();
        System.out.println("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_transmission = sc.nextLine();
        total_no_of_Cars++;
    }

    @Override
    public void getDetails(){
        System.out.println("CAR NAME: "+ car_name);
        System.out.println("CAR COLOR "+ car_color);
        System.out.println("CAR FUEL TYPE(DIESEL/PETROL): "+ car_fuel_type);
        System.out.println("CAR PRICE: "+ car_price);
        System.out.println("CAR TYPE(SEDAN/SUV/HATCHBACK): "+ car_type);
        System.out.println("CAR TRANSMISSION(AUTOMATIC/MANUAL): "+ car_transmission);

    }

}


