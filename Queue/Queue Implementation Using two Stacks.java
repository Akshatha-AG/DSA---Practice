import java.util.*;

public class Implementation{
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void add(int data){
        
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        stack1.push(data);

            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
    }

    public static void delete(){
        if(stack1.isEmpty()){
            System.out.println("Empty Queue");
            return;
        }
        stack1.pop();
    }

    public static void printQueue(){
        if(stack1.isEmpty()){
            System.out.println("Empty Queue");
            return;
        }

        System.out.println(stack1);
    }

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        printQueue();
        delete();
        printQueue();
    }
    
}