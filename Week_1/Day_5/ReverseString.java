package Week_1.Day_5;

public class ReverseString {
    public void reverseString(char[] s) {
      
     int left =0;    // starting ptr
     int right=s.length-1; // ending ptr
     while(left<right){
        char temp=s[left];
        s[left]=s[right]; // swaping left and right char
        s[right]=temp;
        left ++;
        right--;
       }
    }
    public static void main (String [] args){
        ReverseString obj=new ReverseString();
        char[] s={'A','A','R','A','F'};
        obj.reverseString(s);
         for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
         }
    }

}
