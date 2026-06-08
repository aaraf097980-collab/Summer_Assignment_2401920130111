package Week_2.Day_1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueChar {
     public int firstUniqChar(String s) {
        //  create map frquency store krne ke liye;
         HashMap<Character,Integer> map=new HashMap<>();
         // and queue index store krne ke liye;
         Queue<Integer> Q=new LinkedList<>();
         //traversing full string ;
         for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //update frequency in the map and adding index in queue ;
            map.put(ch,map.getOrDefault(ch,0)+1);
            Q.add(i);
            //remove index from the queue if frequency is greater than 1;
            while(!Q.isEmpty()&& map.get(s.charAt(Q.peek()))>1){
                Q.poll();
            }
         }
         //if queue is empty then return -1;
     if (Q.isEmpty()){
        return -1;
     }
     return Q.peek();

     }
     public static void main (String [] args){
        FirstUniqueChar obj=new FirstUniqueChar();
        String s="aaraf";
        System.out.println(obj.firstUniqChar(s));
     }
}
