package Week_1.Day_5;

public class LongCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        // if there is no string in the array then rerturn empty string ;
        int n=strs.length;
        if (n==0){
            return "";
        }
        int prifixLen=0;
            while(true){
            if (prifixLen<strs[0].length()){
                 boolean allok=true ;
                char ch=strs[0].charAt(prifixLen);
                for (int i=1;i<n;i++)
                {    
                    // if current index valid hai aur char match ho raha hai
                    if (prifixLen<strs[i].length() && strs[i].charAt(prifixLen)==ch){
                        // nothing to do
                    }
                    else {
                        allok=false ;
                        break;
                    }
                }
                 // agar sab match kar gaye to prefix aage badha do
                if (allok){
                    prifixLen++;
                }
                else {
                    break;
                }

        }
        else 
                 {   
                    break;
                }
            }
        
        return strs[0].substring(0,prifixLen);
    }


      public static void main (String [] args){
        LongCommonPrefix obj=new LongCommonPrefix();
        String[] strs={"flow","flower","flowing"};
        System.out.println(obj.longestCommonPrefix(strs));

      }
    }
    
    


