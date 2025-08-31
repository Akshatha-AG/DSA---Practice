public class Implementation{
    Node head;
    

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
        }
    }
    //add an element
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head= newNode;
            return;
        }

        Node cuNode = head;

        while(cuNode.next !=null){
            cuNode=cuNode.next;
        }
        cuNode.next=newNode;
        
    }
    //Deleting Element
    public void delete(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }

        head = head.next;
    }

    //Printing Linked list
    public void printList(){
        Node cuNode=head;

        while(cuNode.next!=null){
            System.out.print (cuNode.data+" | ");
            cuNode=cuNode.next;
        }
        System.out.print(cuNode.data);
        System.out.println();
    }

    public static void main(String[] args) {
        Implementation queue=new Implementation();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.printList();
        queue.delete();
        queue.printList();
    }
}