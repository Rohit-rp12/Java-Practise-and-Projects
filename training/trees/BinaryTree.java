class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Solution{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    
    //for PreOrder traversal
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //for InOrder traversal
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //for PostOrder traversal
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args){
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Solution s = new Solution();
        Node root = s.buildTree(nodes);
        
        // Print the root node's data to verify the tree was built
        if (root != null) {
            System.out.println("Root: " + root.data);
        }

        // Perform and print the different tree traversals
        System.out.println("PreOrder Traversal:");
        preOrder(root);
        System.out.println("\nInOrder Traversal:");
        inOrder(root);
        System.out.println("\nPostOrder Traversal:");
        postOrder(root);
    }
}
