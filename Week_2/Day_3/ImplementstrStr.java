package Week_2.Day_3;

public class ImplementstrStr {
public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        //if the length of needle is greater than haystack then it is not possible to find needle in haystack andreturn -1;
       if(m>n) return -1;
            // Try every possible starting position in haystack
           for (int i=0;i<=n-m;i++){
            int j;
              // Compare characters of needle with haystack
            // starting from index i
            for (j=0;j<m;j++){
            
                if (haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            // If all characters matched return the starting index
            if(j==m){
                return i;
            }
        }
        return -1;
    }
    public static void main (String [] args){
        ImplementstrStr solution = new ImplementstrStr();
        String haystack="hello";
        String needle="ll";
        System.out.println(solution.strStr(haystack, needle));
    }
    
}
