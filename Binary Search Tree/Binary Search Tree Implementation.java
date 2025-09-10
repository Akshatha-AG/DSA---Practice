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

        public void inorder(Node root){
            if(root == null){
                return;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        Node root = null;

        int nodes[] = {5,1,3,4,2,7};

        for (int i=0; i<nodes.length; i++){
            root = tree.buildTree(nodes[i], root);
        }
        tree.inorder(root);
    }
}
