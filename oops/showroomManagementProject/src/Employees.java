import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility{
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_Department;

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();  //generate random id for employees
        emp_id = String.valueOf(uuid);
        System.out.println("========================= *** ENTER EMPLOYEE DETAILS *** =========================");
        System.out.println();
        System.out.println("EMPLOYEE NAME: ");
        emp_name = sc.nextLine();
        System.out.println("EMPLOYEE AGE: ");
        emp_age = sc.nextInt();
        System.out.println("EMPLOYEE DEPARTMENT: ");
        emp_Department = sc.nextLine();
        System.out.println("SHOWROOM NAME: ");
        showroom_Name = sc.nextLine();
    }

    @Override
    public void getDetails(){
        System.out.println("ID: "+ emp_id);
        System.out.println("NAME : "+ emp_name);
        System.out.println("AGE: "+ emp_age);
        System.out.println("DEPARTMENT: "+ emp_Department);
        System.out.println("SHOWROOM NAME: "+ showroom_Name);
    }

}
