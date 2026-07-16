import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove indices outside current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller values from back
            while (!deque.isEmpty() &&
                    nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            // Window complete
            if (i >= k - 1) {
                ans[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        int[] ans = maxWindow(arr, k);

        System.out.println(Arrays.toString(ans));
    }
}