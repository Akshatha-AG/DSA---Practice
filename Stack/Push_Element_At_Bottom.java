import java.util.*;

public class Push_Element_At_Bottom{
     public static void main(String[] args) {

        //Implementation Using Collection FrameWork
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println( stack.peek());
        pushElementAtBottom(stack, 0);
        
        System.out.println(stack);
     }

     public static void pushElementAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushElementAtBottom(s, data);
        s.push(top);
     }
}