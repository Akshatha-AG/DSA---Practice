public class Check_Palindrome{
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

    public Node findmid(){

        Node turtle = head;
        Node hare = head;
        if ( head == null){
            System.out.println("Empty list");
        }

        else if(head.next==null && head.next.next == null){
            System.out.println("There are only one or two element in the list");
            
        }else{
        

        while(hare.next !=null && hare.next.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        
        }
        return(turtle);
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
        System.out.println();
    }

    public Node reverse(Node head){
        Node prev=null;
        if (head==null){
            System.out.println("Empty list");
            
        }else{
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
    return prev;
    }

    //check for palindrome
    public void palindrome(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        if(head.next==null){
            System.out.println("List has only one element");
            return;
        }

        Node FHFN = head;
        Node mid=findmid();
        Node SHFN = reverse(mid.next);

        while(SHFN !=null) {
            if(FHFN.data != SHFN.data){
                System.out.println("Not a palindrome");
                return;
            }
            SHFN=SHFN.next;
            FHFN=FHFN.next;
        }
        System.out.println("Yes the list is palindrome");
    }
 
    public static void main(String[] args) {
        Check_Palindrome  list =new Check_Palindrome();
        list.addFirst(50);
        list.addFirst(25);
        list.addLast(25);
        list.addLast(100);
        list.addmid(100, 0);
        list.printList();
        list.palindrome();
    }
}
