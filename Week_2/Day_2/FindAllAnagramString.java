package Week_2.Day_2;
       //Find All Anagram in a String
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramString {
      public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        int [] freqCount1=new int [26];
        int [] freqCount2=new int [26];
        List<Integer> result=new ArrayList<>();
        // Count Frequency of chracter in p
        for (char c: p.toCharArray()){
           freqCount1[c-'a']++;
        }
        for (int i=0;i<n;i++){
           freqCount2[s.charAt(i)-'a']++; 
           // remove the chracter that is out of the window
        if ( i>=m){
         freqCount2[s.charAt(i-m)-'a']--;
        }
        // comparing counts
        if(i>=m-1){
    if (Arrays.equals(freqCount1,freqCount2)){
        result.add(i-p.length()+1);
    }
        }
        }
    return result;
    }
     public static void main (String [] args){
        FindAllAnagramString obj=new FindAllAnagramString();
        String s="abab";
        String p="ab";
        System.out.println(obj.findAnagrams(s, p));

     }
    
}
