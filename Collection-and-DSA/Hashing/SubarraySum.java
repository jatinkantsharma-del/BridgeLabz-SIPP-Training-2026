import java.util.*;

public class SubarraySum {

    public static int subarraySumEqualsK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            count += map.getOrDefault(sum - k, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};

        System.out.println(subarraySumEqualsK(nums, 2));
    }
}