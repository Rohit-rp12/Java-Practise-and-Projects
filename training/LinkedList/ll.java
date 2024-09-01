class ll {

    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;  // Define head at the class level

    // Constructor for the ll class
    public ll() {
        this.head = null;
    }

    // addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // Correct assignment here
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curNode = head; // Temporary node to traverse the list, first we begin with head
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ll list = new ll();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.printList();
    }
}



//delete a node from Linked List

//merge 2 sorted Linked List