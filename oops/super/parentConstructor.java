class animal{
    animal(){
        System.out.println("Animal is created");
    }
}

class dog extends animal{
    dog(){
        super();       //invokes parent class constructor
        System.out.println("Dog is created");
    }
}

public class parentConstructor{
    public static void main(String[] args){
        dog obj = new dog();
    }
}