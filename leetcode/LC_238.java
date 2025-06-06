/* https://leetcode.com/problems/product-of-array-except-self/ */

public class LC_238 {
    public static void main(String[] args) {
        LC_238 lc = new LC_238();
        lc.productExceptSelf(new int[]{1, 2, 3, 4});
    }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int left = 1;
        int right = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left *= nums[i];
            System.out.println(result[i]);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}
