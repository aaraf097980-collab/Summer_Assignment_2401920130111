// LeetCode 26 - Remove Duplicates from Sorted Array
// Time Complexity: O(n)
// Space Complexity: O(1)

public class DuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {

        int k = nums.length;
        int i = 0;
        for (int j = 1; j < k; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main (String [] args ){
        DuplicatesSortedArray obj =new DuplicatesSortedArray();
        int [] nums={1,1,2};
        System.out.println(obj.removeDuplicates(nums));
    }
}
