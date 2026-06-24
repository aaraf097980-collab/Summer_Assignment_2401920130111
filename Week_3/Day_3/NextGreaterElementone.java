package Week_3.Day_3;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementone {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> helperStack = new Stack<>();

        // Find next greater element for every element in nums2
        for (int i = nums2.length - 1; i >= 0; i--) {

            int element = nums2[i];

            while (!helperStack.isEmpty() &&
                    helperStack.peek() <= element) {
                helperStack.pop();
            }

            if (helperStack.isEmpty()) {
                map.put(element, -1);
            } else {
                map.put(element, helperStack.peek());
            }

            helperStack.push(element);
        }

        // Build answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        NextGreaterElementone obj = new NextGreaterElementone();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] ans = obj.nextGreaterElement(nums1, nums2);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}