import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;

public class Showroom implements utility{

    String showroom_Name;

    String showroom_Address;

    int total_Employess;

    int total_no_of_Cars=0;

    String manager_Name;
    @Override
    public void getDetails(){
        System.out.println("Showroom Name: "+ showroom_Name);
        System.out.println("Showroom Address: "+ showroom_Address);
        System.out.println("Manager Name: "+ manager_Name);
        System.out.println("Total Employees: "+ total_Employess);
        System.out.println("Total Cars in Stock: "+ total_no_of_Cars);
    }
    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ========================= *** ENTER SHOWROOM DETAILS *** =========================");
        System.out.println();
        System.out.println("SHOWROOM NAME: ");
        showroom_Name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS: ");
        showroom_Address = sc.nextLine();
        System.out.println("MANAGER NAME: ");
        manager_Name = sc.nextLine();
        System.out.println("TOTAL NUMBER OF EMPLOYEES: ");
        total_Employess = sc.nextInt();
        System.out.println("TOTAL CARS IN STOCK: ");
        total_no_of_Cars = sc.nextInt();
    }

}
