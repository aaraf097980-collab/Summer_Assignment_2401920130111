    package Week_2.Day_5;
public class StringCompression {
         public int compress(char[] chars) {
        int i = 0;   
        int index = 0; 
   // traverse with entire array ;
        while (i < chars.length) {
            // current char ko store kro 
            char current = chars[i];
            int count = 0;  
            // same char ko count krte hai       
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }        
            chars[index++] = current;
            if (count > 1) {
                // count ko digit me separate krte hai 
                String cnt = Integer.toString(count);
                for (char c : cnt.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }  // Compressed array ki final length return karo
        return index;
    }
    public static void main(String [] args){
      StringCompression obj =new StringCompression();
      char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
     int len = obj.compress(chars);
     System.out.println(len);
     }
}
