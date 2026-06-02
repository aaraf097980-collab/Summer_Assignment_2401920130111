//leet code : 53 Maximum Subarray
// Time Complexity: o(n)
// Space Complexity: o(1)
 package Week_1.Day_2;
  
public class MaximumSubarray {
    class Solution {
         public int maxSubArray(int[] nums) {
    int sum=0;
    int maxi=Integer.MIN_VALUE;
    for (int i=0;i<nums.length;i++){
        sum=sum + nums[i];
        if (sum>maxi){
            maxi=sum;
        }
        if (sum<0){
            sum=0;
        }
    }
    return maxi;
}
}
     public static void main (String []args){
       MaximumSubarray obj=new MaximumSubarray();
       int [] nums= {5,4,-1,7,8};
      int result = obj.new Solution().maxSubArray(nums);
       System.out.println(result); 
     }
  
    }
