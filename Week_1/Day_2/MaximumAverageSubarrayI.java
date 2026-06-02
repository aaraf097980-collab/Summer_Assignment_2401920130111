// leetcode 643: Maximum Avarage Subarray I
// Time Complexity: o(n)
// Space Complexity: o(1)
package Week_1.Day_2;

public class MaximumAverageSubarrayI {
     class Solution {
           public double findMaxAverage(int[] nums, int k) {
        double average =0.0;
        double result =0.0;

        int sum=0;
        for (int i=0 ;i<k;i++){
            sum=sum+nums[i];
        }
        average = sum * 1.0 /k;
        result =average;

        for (int i=k; i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            average =sum *1.0/k;
            result = Math.max(result,average);
        }
        return result;
    }  
     }
     public static void main (String [] args){
       MaximumAverageSubarrayI obj =new MaximumAverageSubarrayI();
       int [] nums={1,12,-5,-6,50,3};
       int k=4;
       double result =obj.new Solution().findMaxAverage(nums, k);
       System.out.println(result); 
     }
    
}
