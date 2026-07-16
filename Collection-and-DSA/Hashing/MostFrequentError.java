import java.util.*;

public class MostFrequentError {

    public static int mostFrequentErrorCode(int[] codes) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int bestCode = codes[0];
        int bestCount = 0;

        for (int code : codes) {

            int count = map.getOrDefault(code, 0) + 1;
            map.put(code, count);

            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }

        return bestCode;
    }

    public static void main(String[] args) {

        int[] codes = {500, 404, 500, 200, 500, 404};

        System.out.println(mostFrequentErrorCode(codes));
    }
}