
public class Implementation{
    static Node head;
    static Node tail;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int d){
            data = d;
        }
    }

    //Adding Elements
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        
        if(head.next == null){
            head.next = newNode;
            newNode.prev  = head;
            newNode.next = null;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev=tail;
        tail = newNode;
        newNode.next =null;

    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        newNode.prev = null;
    }

    public void addMid(int idx, int data){
        Node newNode = new Node(data);

        if(head == null){
            addFirst(data);
            return;
        }
        Node cuNode = head;
        int i = 0;
         
        while(i<idx-1){
            cuNode =cuNode.next;
            i++;
        }
        newNode.next = cuNode.next;
        cuNode.next.prev=newNode;
        cuNode.next=newNode;
        newNode.prev=cuNode;
    }

    //Print List
    public void printList(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        System.out.print("NULL"+"< - >");
        Node cuNode = head;
        while(cuNode!=null){
            System.out.print(cuNode.data+"< - >");
            cuNode = cuNode.next;
        }
        System.out.println("NULL");
    }

    //Deleting elements
    public void deleteLast(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }

        if(head == tail){
            tail = head =null;
            return;
        }

        tail = tail.prev;
        tail.next=null;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }

        if(head == tail){
            head = tail= null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void deleteMid(int idx){
        if(head == null){
            System.out.println("Empty list");
            return;
        }

        if(idx == 0){
            deleteFirst();
            return;
        }
        
        Node cuNode = head;
        int i = 0;
        while(i<idx-1){
            cuNode = cuNode.next;
            i++;
        }

        if(cuNode.next.next == null){
            deleteLast();
            return;
        }
        Node a = cuNode.next.next;

        cuNode.next = a;
        a.prev = cuNode;
    }

    public static void main(String[] args) {
        Implementation list = new Implementation();
        list.addLast(5);
        list.addLast(10);
        list.printList();
        list.addMid(1, 8);
        list.printList();
        list.deleteMid(2);
        list.printList();
        
        System.out.println("Tail: "+tail.data +"\nHead: "+head.data);
    }
}