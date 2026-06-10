package Week_2.Day_3;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        //concatenate the string with itself ;
    String doubled = s+s;
    int n=doubled.length();
    // remove the first and last chracter and check if the original string is present in the new string or not if;
    //if present truee otherwise false;
    return doubled.substring(1,n - 1).contains(s);
}
public static void main (String[] args){
    RepeatedSubstringPattern solution = new RepeatedSubstringPattern();
    String s="abab";
    System.out.println(solution.repeatedSubstringPattern(s));
}
}
