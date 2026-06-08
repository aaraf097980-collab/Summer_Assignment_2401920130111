package Week_2.Day_1;

 public class RansomeNote{
    public boolean canConstruct(String ransomNote, String magazine){
        // create a frequency array ;
        int [] freqcount=new int[26];
        //count frequency of each character in magazine and store frequuency in array ;

        for(char c: magazine.toCharArray()){
            freqcount[c-'a']++;
        }  
        //traverse the ransome note;
        for(char c: ransomNote.toCharArray()){
            if(freqcount[c-'a']==0){
                return false;
            }
            freqcount[c-'a']--;
        }
        return true;
    }
    public static void main (String [] args){
        RansomeNote obj=new RansomeNote();
        String ransomeNote="aabsyh";
        String magazine="aabssykhsh";
        System.out.println(obj.canConstruct(ransomeNote, magazine));
    }
 }