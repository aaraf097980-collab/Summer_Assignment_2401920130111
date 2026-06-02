
// Two Sum
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.HashMap;
import java.util.Arrays;
public class TwoSum {
    public int [] Solution(int[] nums,int target ){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main (String [] args ){
        TwoSum obj = new TwoSum();

        int[] nums = {3,2,4};
        int target = 6;

        int[] result = obj.Solution(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
