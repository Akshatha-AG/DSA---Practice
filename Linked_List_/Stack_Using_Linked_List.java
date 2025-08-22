public class Practice{
    Node head;
    

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
        }
    }

   public void push(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }
    
    public void pop(){
        if(head==null){
            System.out.println("Empty Stack");
            return;
        }

        head = head.next;
    }

    public void peek(){
      if(head==null){
            System.out.println("Empty Stack");
            return;
        }
        System.out.println("Peek Element: "+head.data);
    }

    //Printing Linked list
    public void printStack(){
        Node cuNode=head;

        while(cuNode.next!=null){
            System.out.println(" | " +cuNode.data+" | ");
            cuNode=cuNode.next;
        }
        System.out.print(" | "+cuNode.data+" | ");
        System.out.println("\n");
    }

    
 
    public static void main(String[] args) {
        Practice stack =new Practice();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.peek();
        stack.push(50);
    }
}
