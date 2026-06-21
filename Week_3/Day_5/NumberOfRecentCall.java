package Week_3.Day_5;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCall {
    Queue<Integer> queue;
    public NumberOfRecentCall() {
         // Initialize queue
        queue = new LinkedList<>();

    }
     public int ping(int t) {
        queue.add(t);
        // Remove requests older than [t - 3000]
        while(!queue.isEmpty() && t-3000 >queue.peek()){
            queue.poll();
        }
        return queue.size();
    }
    public static void main (String [] args){
        NumberOfRecentCall obj=new NumberOfRecentCall();
        System.out.println(obj.ping(1));     
        System.out.println(obj.ping(100));   
        System.out.println(obj.ping(3001));  
        System.out.println(obj.ping(3002)); 
        

    }   
}
