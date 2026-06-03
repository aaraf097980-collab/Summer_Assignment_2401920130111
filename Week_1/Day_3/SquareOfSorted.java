package Week_1.Day_3;

public class SquareOfSorted {
    class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] result = new int [nums.length];
       for (int i=0;i<n;i++){
        nums[i]=nums[i]* nums[i];
       }
       int head=0;
       int tail=nums.length-1;

        for (int tag=nums.length-1;tag>=0;tag--){
            if (nums[head]>nums[tail]){
                result [tag]=nums[head];
                head++;
            }
            else {
                result [tag]=nums[tail];
                tail--;
            }
        }
        return result;
    }}
    public static void main (String [] args ){
        SquareOfSorted obj = new SquareOfSorted();
        int [] nums={-7,-4,-1,2,3,6,10};
        int [] result =obj.new Solution().sortedSquares(nums);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}
