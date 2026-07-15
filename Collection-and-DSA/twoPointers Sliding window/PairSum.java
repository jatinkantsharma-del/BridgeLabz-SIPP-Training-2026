import java.util.Arrays;

public class PairSum {

    public static int[] findPairSum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target)
                return new int[]{arr[left], arr[right]};

            if (sum < target)
                left++;
            else
                right--;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] transactions = {2, 4, 7, 11, 15};
        int target = 18;

        System.out.println(Arrays.toString(findPairSum(transactions, target)));
    }
}