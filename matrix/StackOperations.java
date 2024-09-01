import java.util.Scanner;
import java.util.ArrayList;

// Define the Stack interface
interface Stack {
    void push(int value);
    int pop();
    void display();
}

// Implement the Stack interface in ArrayStack class
class ArrayStack implements Stack {
    private ArrayList<Integer> stack;
    private int top;
    private int maxSize;

    public ArrayStack(int size) {
        stack = new ArrayList<>(size);
        top = -1;
        maxSize = size;
    }

    @Override
    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stack.add(++top, value);
            System.out.println("Pushed: " + value);
        }
    }

    @Override
    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int value = stack.remove(top--);
            System.out.println("Popped: " + value);
            return value;
        }
    }

    @Override
    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack.get(i));
            }
        }
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayStack stack = new ArrayStack(10);

        // Push 10 values onto the stack
        System.out.println("Enter 10 values to push onto the stack:");
        for (int i = 0; i < 10; i++) {
            int value = scanner.nextInt();
            stack.push(value);
        }

        // Display the stack
        stack.display();

        // Pop 3 values from the stack
        System.out.println("\nPerforming 3 pop operations:");
        for (int i = 0; i < 3; i++) {
            stack.pop();
        }

        // Display the stack again
        stack.display();
        
        scanner.close();
    }
}