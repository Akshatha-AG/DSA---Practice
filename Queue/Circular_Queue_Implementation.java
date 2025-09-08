import java.util.*;

public class Implementation{
    static int arr[] = new int[5];
    static int front = -1;
    static int rear = -1;
    static int size=arr.length;
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        printQueue();
        delete();
        printQueue();
        push(85);
        printQueue();
        delete();
        delete();
        printQueue();

        System.out.println("front: "+ arr[front]);
        System.out.println("rear: "+ arr[rear]);
    }

    public static void push(int data){
        if((rear+1)%size == front){
            System.out.println("Queue is Full");
            return;
        }else if(rear==-1){
            front = rear = 0;
            arr[rear]=data;
            return;
        }
        rear = (rear + 1)%5;
        arr[rear]=data;
    }

    public static void delete(){
        if(rear == -1){
            System.out.println("Empty Queue");
            return;
        }
        if(front == rear){
            front=rear=-1;
        }
        arr[front]= 0;
        front = (front+1)%5;
    }

    public static void printQueue(){
        if(rear==-1){
            System.out.println("Empty Queue");
            return;
        }
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
    }
}