package Week_2.Day_3;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
     int n=s.length();
     int m=t.length();
     //Two Pointer Approch 
    while (i<n && j<m){
        //if the character is  same then move both pointer otherwise move only pointer of t;
        if (s.charAt(i)==t.charAt(j)){
            i++;
            j++;
        }
        else {
            j++;
        }
    } //if i is equal to n then it means we have found all character of s in t in order and return true otherwise return false ;
  return (i==n);
    }
    public static void main (String [] args){
        IsSubsequence obj=new IsSubsequence();
        String s="abc";
        String t="ahbgdc";
        System.out.println(obj.isSubsequence(s, t));
    }
}
