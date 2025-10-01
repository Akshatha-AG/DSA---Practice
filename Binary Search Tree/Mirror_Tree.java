import java.util.*;
public class Implementation{

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
        }
    }

    static class BuiltTree{

        public Node Build(Node root, int d){
            
            if(root == null){
                Node newNode = new Node(d);
                return newNode;
            }

            if(d > root.data){
                root.right = Build(root.right, d);
            }
            if(d < root.data){
                root.left = Build(root.left, d);
            }
            return root;
        }

        public void inorder(Node root){
            if( root == null){
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public void printTree(Node root){
            Queue<Node> q = new LinkedList<>();

            int k=0;
            q.add(root);
            q.add(null);
            
            while(!q.isEmpty()){
            Node node = q.remove();
                if(node == null){
                    System.out.println();
                    if(!q.isEmpty()){
                        q.add(null);
                    }
                    
                }else{
                    
                    System.out.print(node.data + " ");
                    k++;
                    if(node.left != null){
                        q.add(node.left);
                    }if(node.right!=null){
                        
                        q.add(node.right);
                    }
                    
                }
            }
            
        }

        public void mirrorTree(Node root){
            //System.out.println(root.data);
            if(root == null) return;

            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            mirrorTree(root.left);
            mirrorTree(root.right);
        }
    }

    public static void main(String[] args) {
        BuiltTree tree = new BuiltTree();
        int nodes[] = {4,1,5,2};

        Node root = null;

        for(int i=0; i<nodes.length; i++){
            root = tree.Build(root, nodes[i]);
        }
        tree.printTree(root);
        System.out.println();
        tree.mirrorTree(root);
        tree.printTree(root);
        
    }
}