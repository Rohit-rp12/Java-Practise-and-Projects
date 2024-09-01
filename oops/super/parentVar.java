class animal{
    String color = "white";
}

class dog extends animal{
    String color = "black";
    public void printColor(){
        System.out.println(color);
        System.out.println(super.color);  //super keyword invokes parent class variable
    }
}

public class parentVar{
    public static void main(String[] args){
        dog obj = new dog();
        obj.printColor();
    }
}