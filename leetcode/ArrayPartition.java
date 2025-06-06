/* https://leetcode.com/problems/array-partition/ */

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {

    }

    public int arrayPairSum(int[] nums) {
        int result = 0;

        Arrays.sort(nums);


        for (int i = 0; i < nums.length - 1; i += 2) {
            result += Math.min(nums[i], nums[i + 1]);
        }

        return result;
    }
}
