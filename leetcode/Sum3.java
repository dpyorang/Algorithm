import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        Sum3 s = new Sum3();
        System.out.println(s.threeSum(new int[]{1, -1, -1, 0}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        /* i는 고정해놓고 나머지 두개 투포인터 */
        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if (sum > 0) {
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));

                    /* 수가 같을 경우 중복 값이 들어갈 수 있음 */
                    while (start < end && nums[start] == nums[start + 1]) start++;
                    while (start < end && nums[end] == nums[end - 1]) end--;

                    start++;
                    end--;
                }
            }
        }

        return result;
    }
}
