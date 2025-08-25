import java.util.*;

public class Implementation{
    static int idx = 0;
    static int peek = -1;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //System.out.println("Enter capacity of stack: ");
    //int capacity =sc.nextInt();

    int capacity =4;
    int stack[]= new int[capacity];

    printStack(stack, capacity);
    push(10, stack, capacity);
    push(20, stack, capacity);
    printStack(stack, capacity);
    peekElement(stack);
    }

    public static void push(int data, int [] stack, int c){
        if(idx == c){
            System.out.println("Stack overflow");
            return;
        }
        stack[idx] = data;
        idx++;
        peek++;
    }

    public static void pop(int [] stack){
        if(peek == -1){
            System.out.println("Stack Underflow");
            return;
        }
        int len = stack.length;
        stack[len - 1] = 0;
        peek--;
        idx--;
    }
    public static void peekElement(int [] stack){
        if(peek == -1){
            System.out.println("Empty stack");
            return;
        }
        System.out.println("Peek Element: "+ stack[peek]);
    }
    public static void printStack(int [] stack, int capacity){
        if(peek == -1){
            System.out.println("Empty stack");
            return;
        }
        for(int i=capacity-1; i>=0; i--){
            System.out.println("\t | "+stack[i]+" \t |");
        }
        System.out.println();
        
    }
}
