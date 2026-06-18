package Week_3.Day_3;
import java.util.Stack;
public class ValidParanthesis {
     public boolean isValid(String s) {
        // store for opening brackets
        Stack<Character> stack =new Stack<>();
        for (int i=0;i<s.length();i++)
        {     // Agar opening bracket hai to stack me push karo
            if (s.charAt(i)=='('|| s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else {
               if (stack.isEmpty()){ return false;
               }
               // Top element aur current closing bracket match kar rahe hain
                if ((stack.peek()=='(' && s.charAt(i)==')' ) || 
                (stack.peek()=='{' && s.charAt(i)=='}' ) ||
                (stack.peek()=='[' && s.charAt(i)==']' ) ){
                    stack.pop();
                }
                else {
                    //if pair match nhi hua to
                    return false ;
                }
            }
        }
          return stack.size()==0;
}
public static void main (String [] args){
     ValidParanthesis obj =new ValidParanthesis();
        String s = "()[]{}";

        System.out.println(obj.isValid(s));
}
}
