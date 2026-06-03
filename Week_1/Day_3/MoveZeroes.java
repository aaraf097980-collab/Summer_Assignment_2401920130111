package Week_1.Day_3;

public class MoveZeroes {
    class Solution {
    public void moveZeroes(int[] nums){
 int count =0;
 for (int i=0;i<nums.length;i++){
    if (nums[i]!=0){
        nums[count++]=nums[i];
    }
 }
  for (int i=count;i<nums.length;i++){
    nums[i]=0;
  }
    
}
}
    public static void main (String [] args ){
       MoveZeroes obj=new MoveZeroes();
       int []nums={0,1,0,5,6,0,7,0};
       obj.new Solution().moveZeroes(nums);
         for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
         }
         System.out.println();
    }
}
