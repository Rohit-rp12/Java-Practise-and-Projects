import java.util.*;

class MyStack{
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> a = new Stack<>();
    void push(int x){
         stack.push(x);
         if(a.isEmpty()){
            a.push(x);
         }else{
            if(a.peek()>=x){
                a.push(x);
            }
         }
    }

    void pop(){
        
        if(stack.peek() == a.peek()){
            a.pop();
        }
        stack.pop();
    }

    void peek(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println(stack.peek());
        }
    }

    void getMin(){
        if(a.isEmpty()){
            System.out.println("stack is empty");
        }else{
            System.out.println("min element is : "+ a.peek());
        }
    }

}
    public class Main{
        public static void main(String[] args){
            MyStack ms = new MyStack();
            Scanner sc = new  Scanner(System.in);
            int size = sc.nextInt();
            for(int i=0; i<size; i++)                           
            {
                ms.push(sc.nextInt());
            }

            ms.peek();
            ms.pop();
            ms.peek();
            ms.getMin();
        }
    }
