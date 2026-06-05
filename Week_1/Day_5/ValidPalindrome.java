package Week_1.Day_5;
 public class ValidPalindrome {
       // checking character is palindrome or not;
       public boolean isAlphaNum(char ch){
        if ((ch >= '0' && ch <= '9') || (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')) {
            return true;
        }  
        return false ;
    }    
        // chechking string is palindrome or not
        public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while (start < end){
            if (!isAlphaNum(s.charAt(start))){
                start++;
                continue;
            }
            if (!isAlphaNum(s.charAt(end))){
                end--;
                continue;
            }
          if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

           start++;
           end--;
        }
        return true;
    }    // now test the function 
       public static void main (String [] args){
        ValidPalindrome obj=new ValidPalindrome();
        String s="A man, a plan, a canal: panama";
        boolean result=obj.isPalindrome(s);
        System.out.println(result);
    }
 }