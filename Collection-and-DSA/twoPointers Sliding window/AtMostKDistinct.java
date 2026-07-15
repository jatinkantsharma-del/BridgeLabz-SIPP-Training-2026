import java.util.*;

public class AtMostKDistinct {

    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < arr.length; end++) {

            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);

            while (map.size() > k) {

                map.put(arr[start], map.get(arr[start]) - 1);

                if (map.get(arr[start]) == 0)
                    map.remove(arr[start]);

                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);

        }

        return maxLength;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 2, 3};

        System.out.println(longestSubarray(arr, 2));

    }
}