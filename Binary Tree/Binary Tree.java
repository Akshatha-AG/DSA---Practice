public class Implementation{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data =data;
            left=null;
            right=null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public Node Build (int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);

            newNode.left = Build(nodes);
            newNode.right=Build(nodes);

            return newNode;
        }

        public void preorder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data +" ");
            preorder(root.left);
            preorder(root.right);
        }

        public void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data);
        }

        public void inorder(Node root){
            if(root == null){
                return;
            }

            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }

        public int countNodes(Node root){
            if(root == null){
                return 0;
            }

            int ln = countNodes(root.left);
            int rn = countNodes(root.right);

            return ln+rn+1;
        }

        public int sumNodes(Node root){
            if(root == null){
                return 0;
            }
            
            int ln = sumNodes(root.left);
            int rn = sumNodes(root.right);

            return (ln+rn+root.data);
            
        }

        public int height(Node root){
            if(root == null){
                return 0;
            }

            int ln = height(root.left);
            int rn = height(root.right);

            if(ln>rn){
                return ln+1;
            }else{
                return rn+1;
            }
        }
    }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root;
        root = tree.Build(nodes);
        System.out.print("Preorder: ");
        tree.preorder(root);
        System.out.println();
        System.out.print("Postorder: ");
        tree.postorder(root);
        System.out.println();
        System.out.print("Inorder: ");
        tree.inorder(root);
        System.out.println();

        System.out.println("Total Nodes: "+tree.countNodes(root));
        System.out.println("Total sum: "+tree.sumNodes(root));
        System.out.println("Height: "+tree.height(root));
    }
}