package Week_3.Day_5;

import java.util.Stack;

public class ImplementQueueUsingStack {
    private final Stack<Integer> input;
    private final Stack<Integer> output;

    public ImplementQueueUsingStack() {
        input=new Stack<>();
        output=new Stack<>();
    }
     // Add element to queue
    public void push(int x){
        input .push(x);
    }
    // Remove front element
    public int pop(){
         peek();
         return output.pop();
    }
     // Return front element
    public int peek() {
       if(output.isEmpty()){
        while(!input.isEmpty()){
            output.push(input.pop());
        }
       }
            return output.peek();
              
    }
    // Check if queue is empty
     public boolean empty() {
       return output.empty() && input.empty(); 
    }


        public static void main(String[] args) {

    ImplementQueueUsingStack obj = new ImplementQueueUsingStack();

    obj.push(10);
    obj.push(20);
    obj.push(30);

    System.out.println("Front Element: " + obj.peek());
    System.out.println("Removed: " + obj.pop());

    System.out.println("Front Element: " + obj.peek());

    System.out.println("Is Queue Empty? " + obj.empty());
}
    }
