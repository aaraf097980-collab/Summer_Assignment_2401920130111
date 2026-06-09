package Week_2.Day_2;

public class permutationinString {

    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if (m<n) return false;
        //creating two frequency map for both String;
        int []  map1= new int [26];
        int []  map2=new int[26];
        //filling frequency map for both string;
         for (int i = 0; i < n; i++) {
            map1[s1.charAt(i) - 'a']++;
        }  
        // filling frequency map for the first window of string s2;
        for (int i = 0; i < n; i++) {
            map2[s2.charAt(i) - 'a']++;
        }  //check if both frequency map are same then return true;
             if (isMatched(map1,map2)) return true;
        
        for (int i=n;i<m;i++){
            //sliding the window by one character and updating the frequency map for string s2;
            map2[s2.charAt(i)-'a']++;
            map2[s2.charAt(i-n)-'a']--;
            
              if (isMatched(map1,map2)){
            return true;
           } 
        }
         return false;
    } 
    //function to check if both frequency map are same or not ;
   private boolean isMatched(int[] map1, int[] map2) {
    for (int i = 0; i < 26; i++) {
        if (map1[i] != map2[i])   return false;
    }
       return true;

    }
    public static void main (String []args){
         permutationinString obj=new permutationinString();
         String s1="ab";
         String s2="eidbaooo";
         System.out.println(obj.checkInclusion(s1, s2));
    }
}
