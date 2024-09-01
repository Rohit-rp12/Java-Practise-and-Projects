class A{
    void show(){                                         //example of hierarchial Inheritance
        System.out.println("class A method");
    }
}

class B extends A{
    void showB(){
        System.out.println("class B method");
    }
}

class C extends A{
    void showC(){
        System.out.println("class C method");
    }
}


public class hierarchialInheritance{
    public static void main(String[] args){
        B obj = new B();
        obj.show();               //hence both class(B n C) objects can access methods of class A
        
        C obj1 = new C();
        obj1.show();
    }
}