public class 징검다리건너기_1215 {
    public static void main(String[] args) {
        solution(new int[]{2, 4, 5, 3, 2, 1, 4, 2, 5, 1}, 3);
    }

    public static int solution(int[] stones, int k) {
        int answer = 0;

        int left = 1;
        int right = 0;

        for (int stone : stones) {
            right = Math.max(right, stone);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canCross(stones, k, mid)) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    private static boolean canCross(int[] stones, int k, int people) {
        int count = 0;

        for (int stone : stones) {
            if (stone - people < 0) {
                count++;

                if (count >= k) {
                    return false;
                }
            } else {
                count = 0;
            }
        }

        return true;
    }
}
