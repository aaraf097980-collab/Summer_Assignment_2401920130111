package Week_2.Day_4;

public class ReverseWordsOfString3rd {
     public String reverseWords(String s) {
         
          String[] words =s.split(" ");
         StringBuilder result=new StringBuilder();
         for (String word: words){
            //reverse each word and append it to the result
result.append(new StringBuilder(word).reverse());
//append a space after each reversed word ;
       result.append(" ");
         } 
         return result.toString().trim();
    }
    public static void main (String [] args){
        ReverseWordsOfString3rd obj = new ReverseWordsOfString3rd();
        String s="Hello I am Pro Coder";
        System.out.println(obj.reverseWords(s));
    }
}
