import java.util.*;

public class Implementation_Using_ArrayList{
    static int peek = -1;
      static int limit = 4;
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();
        push(1, stack);
        push(10, stack);
        push(20, stack);
        push(50, stack);
        printStack(stack);
        System.out.println(stack.size());
        peekElement(stack);
        push(23, stack);
        printStack(stack);
    }
    
    public static void push(int data, ArrayList<Integer> stack){
            if(stack.size()==limit){
                System.out.println("Stack overflow");
                return;
            }
            stack.add(data);
            peek++;
    }
    
    public static void printStack(ArrayList<Integer> stack){
        if(peek  == -1){
            System.out.println("Empty stack");
            return;
        }
        System.out.println(stack);
    }

    public static void peekElement(ArrayList<Integer> stack){
        int len = stack.size();
        System.out.println("Peek Element: "+stack.get(len-1));
    }
    public static void pop(ArrayList<Integer> stack){
        if(peek == -1){
            System.out.println("Stack underflow");
            return;
        }
        stack.remove(stack.size()-1);
        peek--;
    }
}


