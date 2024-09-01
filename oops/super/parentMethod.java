class animal{
    void eat(){
        System.out.println("...eating...");
    }
}

class dog extends animal{
    void eat(){
        System.out.println("...eating bone..."); 
    }

    void bark(){
        System.out.println("...barking..."); 
    }

    void work(){
        eat();
        super.eat();      //super keyword invokes parent Class Method
        bark();
    }
}

public class parentMethod{
    public static void main(String[] args){
        dog obj = new dog();
        obj.work();
    }
}