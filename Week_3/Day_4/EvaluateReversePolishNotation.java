package Week_3.Day_4;
import java.util.Stack;
class EvaluateReversePolishNoation{
public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        String operators="+-*/";
        for (String token:tokens){
            if (operators.indexOf(token)!=-1){
                 // Pop top two elements from stack
                int d2=st.pop();
                int d1=st.pop();
                int res=0;
                // Perform operation based on operator
                if(token.equals("+"))
                res=d1+d2;
                else if(token.equals("-"))
                res=d1-d2;
                else if(token.equals("*"))
                res=d1*d2;
                else if(token.equals("/"))
                res=d1/d2;
                st.push(res);


            }
        else st.push(Integer.parseInt(token));
          
        }
        // Final answer will be at top of stack
        return st.peek();

    }
    public static void main (String [] args){
       EvaluateReversePolishNoation obj=new EvaluateReversePolishNoation();
       String[] tokens = {"2", "1", "+", "3", "*"};
       int result = obj.evalRPN(tokens);

        System.out.println(result);  

    }
}