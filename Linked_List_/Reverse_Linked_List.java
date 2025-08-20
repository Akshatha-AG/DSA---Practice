public class Reverse_Linked_List{
    Node head;
    

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
        }
    }

    //Adding Elements
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }

    public void addLast(int data){
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


    public void addmid(int data, int idx){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        if(idx==0){
            addFirst(data);
            return;
        }

        Node cuNode=head;
        for ( int i=0; i<idx-1; i++){
            cuNode=cuNode.next;
        }
        newNode.next=cuNode.next;
        cuNode.next=newNode;
    }

    //Deleting Elements
    public void deleteFirst(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        while(last.next!=null){
            secondLast=secondLast.next;
            last=last.next;
        }
        secondLast.next=null;

    }

    public void deleteMid(int idx){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node cuNode = head;
        for(int i=0; i<idx-1; i++){
            cuNode = cuNode.next;
        }
        cuNode.next = cuNode.next.next;
    }

    //Printing Linked list
    public void printList(){
        Node cuNode=head;

        while(cuNode.next!=null){
            System.out.print (cuNode.data+" -> ");
            cuNode=cuNode.next;
        }
        System.out.print(cuNode.data);
    }

    public void reverse(){
        if (head==null){
            System.out.println("Empty list");
            return;
        }

        Node prev=null;
        Node cuNode=head;

        while(cuNode!=null){
            Node nextNode = cuNode.next;

            cuNode.next = prev;
            prev = cuNode;
            cuNode = nextNode;
        }
        head.next = null;
        head = prev;
    }

    public static void main(String[] args) {
        Reverse_Linked_List list =new Reverse_Linked_List();
        list.addFirst(50);
        list.addFirst(25);
        list.addLast(75);
        list.addLast(100);
        list.addmid(0, 0);
        list.printList();
        
        list.reverse();
        System.out.println();
        list.printList();
    }
}
