package Week_2.Day_2;

import java.util.HashMap;

public class LongestSubstringWRC {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        // Creating Hashmap to store the last index of each character;
        HashMap<Character ,Integer > map=new HashMap<>();
        int leftPtr=0;
        int rightptr=0;
        int MaxLength=0;
        //Iterate through the string using right pointer;
        while (rightptr<n){
            char ch =s.charAt(rightptr);
            //chracater is already in tthe map then move the left pointer to the right of the last index of that chracter;
           if( map.containsKey(ch)){  
            
             leftPtr = Math.max(leftPtr, map.get(ch) + 1);
            }
            map.put(ch,rightptr);
              MaxLength = Math.max(MaxLength, rightptr - leftPtr + 1);
            rightptr++;
        }
        return MaxLength;
    }
    public static void main (String [] args){
        LongestSubstringWRC obj=new LongestSubstringWRC();
        String s="abccbaacb";
        System.out.println(obj.lengthOfLongestSubstring(s));
        
    }
}
