
   // Valid Anagram 
package Week_2.Day_1;

public class ValidAnagram {
    // function to chechk if two string anagram or not ;

    public boolean isAnagram(String s, String t){
        //if length of both string is not same then they can not be anagram;
        if(s.length()!=t.length()){
            return false;
        }
        int [] count=new int [26];
    
        for (int i=0;i<s.length();i++){
           // Increase count for character from string s;
            count[s.charAt(i)-'a']++;
             // Decrease count for character from string t;
            count[t.charAt(i)-'a']--;
        }
        // check if all frenquencies are zero ;
        for (int c:count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args){
        ValidAnagram obj=new ValidAnagram();
        String s="anagram";
        String t="nagaram";
        System.out.println(obj.isAnagram(s, t));
    }
    
}
