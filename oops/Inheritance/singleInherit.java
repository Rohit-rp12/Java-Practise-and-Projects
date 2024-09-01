import java.util.*;
                                 //example of single level Inheritance
class employee{
    void sallary(){
        System.out.println("Sallary: 200000");
    }

}

class hr extends employee{
    void bonus(){
        System.out.println("Bonus: 100000");
    }
}

public class singleInherit{

    public static void main(String[] args){
        hr h = new hr();
        h.sallary();
        h.bonus();
    }
}