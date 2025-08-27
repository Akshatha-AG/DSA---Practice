import java.util.*;

public class Reverse_Stack{
     public static void main(String[] args) {

        //Implementation Using Collection FrameWork
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        reverse(stack);
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

     public static void reverse(Stack<Integer> s ){
        if(s.isEmpty()){
           return;
        }
        int top =s.pop();
        reverse(s);
        pushElementAtBottom(s, top);
     }
}