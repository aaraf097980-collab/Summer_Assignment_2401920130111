package Week_1.Day_3;

public class ContainerWithMostWater {
    class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int MaxWater=0;
        int left=0;
        int right=n-1;
        while (left<right){
           int width= right-left;
           int hgt=Math.min(height[left],height[right]);
           int currentWaterArea =width*hgt;
           MaxWater=Math.max(MaxWater,currentWaterArea);
           if (height[left] < height[right]) {
              left++;
          } else {
             right--;
           }      
        }
        return MaxWater;
    }
}
     public static void main (String [] args ){
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int [] height={1,8,6,2,5,4,8,3,7};
        int result =obj.new Solution().maxArea(height);
        System.out.println(result);
     }
    
}
