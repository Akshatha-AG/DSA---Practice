//Queue Implementation using Array

import java.util.*;

public class Practice{
    static int rear=-1;
    
    static int size=5;
    static int arr[]= new int[size];

    

    public void add(int data){
        if(rear==size-1){
            System.out.println("Full queue");
            return;
        }

        rear++;
        arr[rear]=data;
    }

    public void delete(){
        if(rear==-1){
            System.out.println("Empty queue");
            return;
        }
        for(int i=0; i<rear; i++){
            arr[i]=arr[i+1];
        }
        rear--;
    }

    public void display(){
        if(rear==-1){
            System.out.println("Empty queue");
            return;
        }
        for(int i=0; i<=rear; i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
    }

    public void peek(){
        if(rear==-1){
            System.out.println("Empty queue");
            return;
        }
        System.out.println("Peek Element: "+arr[0]);
    }

    public static void main(String[] args) {
        Practice q=new Practice();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.delete();
        q.delete();
        q.display();
        q.peek();

    }
}