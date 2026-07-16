import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] ch = s.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(words));
    }
}