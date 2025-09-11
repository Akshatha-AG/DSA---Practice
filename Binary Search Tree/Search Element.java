public class Implementation {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
        }
    }

    static class BST{

        public Node buildTree(int data, Node root){
            if(root == null){
                return new Node(data);
            }

            if(data < root.data){
                root.left = buildTree(data, root.left);
            }

            if(data > root.data){
                root.right = buildTree(data, root.right);
            }

            return root;
        }

        

        public void search(int val, Node root){

            if(root == null){
                System.out.println("value not found");
                return;
            }
            if(root.data == val){
                System.out.println("Value found");
                return;
            }
            if(val > root.data){
                search(val, root.right);
            }
            if(val < root.data){
                search(val, root.left);
            }
        }

        
    }
    public static void main(String[] args) {
        BST tree = new BST();
        Node root = null;

        int nodes[] = {5,1,3,4,2,7};

        for (int i=0; i<nodes.length; i++){
            root = tree.buildTree(nodes[i], root);
        }
        
        tree.search(10, root);
    }
}
