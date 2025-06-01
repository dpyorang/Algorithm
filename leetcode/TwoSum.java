/* https://leetcode.com/problems/two-sum/ */

import java.util.Arrays;
import java.util.Comparator;


public class TwoSum {
    public static void main(String[] args) {
        
    }

    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int sum = arr[start][0] + arr[end][0];

            if (sum == target) {
                break;
            } else if (target > sum) {
                start++;
            } else if (target < sum) {
                end--;
            }
        }

        return new int[]{arr[start][1], arr[end][1]};
    }
}
