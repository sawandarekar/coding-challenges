package org.techHub.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/">Rotate Array</a>
 *
 */
public class RotateArray {


    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotateArray.rotate(nums, 10);
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // To handle cases where k is larger than the length of the array
        k = k % n;
        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining n - k elements
        reverse(nums, k, n - 1);
        System.out.printf(Arrays.toString(nums));
    }
    // Helper function to reverse a part of the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate_old(int[] nums, int k) {
        while(k != 0){
            int last = nums[nums.length -1];
            for (int i = nums.length-1; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = last;
            k--;
        }
        System.out.printf(Arrays.toString(nums));
    }
}
