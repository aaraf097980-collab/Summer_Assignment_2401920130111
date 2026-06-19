package Week_3.Day_4;

import java.util.Arrays;
import java.util.Stack;

class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
      Stack<Integer> helperStack=new Stack<>();
      int n=temperatures.length;
      int []result=new int [n];
      for (int idx=n-1;idx>=0;idx--){
        // Remove all smaller or equal temperatures
        while (!helperStack.isEmpty() && temperatures[idx]>=temperatures[helperStack.peek()] ){
            helperStack.pop();
        }
         // If stack is not empty, next warmer day exists
        if(!helperStack.isEmpty()){
            result[idx]=helperStack.peek()-idx;
        }
        // Push current index into stack
        helperStack.push(idx);
      }
      return result;
    }
    public static void main (String [] args){
        DailyTemperatures obj =new DailyTemperatures();
       int [] temperatures={73,74,75,71,69,72,76,73};
       int[] answer = obj.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(answer));
    }
}