package Week_1.Day_2;
import java.util.HashMap;

public class ContainsDuplicates {

    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                if (map.containsKey(num)) {
                    return true;
                }
                map.put(num, 1);
            }
            return false;
        }
    }
    public static void main(String[] args) {
    ContainsDuplicates obj = new ContainsDuplicates();
        int[] nums = {1, 2, 3, 1};
        boolean result = obj.new Solution().containsDuplicate(nums);
        System.out.println(result);
    }
}