import java.util.HashMap;
import java.util.Map;

public class CheckPermutationSolution {
    public static boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();
        int tmp1;
        int tmp2;
        for (int i = 0; i < s1.length(); i++) {
            if (s1Map.containsKey(s1.charAt(i))) {
                tmp1 = s1Map.get(s1.charAt(i)) + 1;
                s1Map.remove(s1.charAt(i));
                s1Map.put(s1.charAt(i), tmp1);
            } else {
                s1Map.put(s1.charAt(i), 1);
            }


            if (s2Map.containsKey(s2.charAt(i))) {
                tmp2 = s2Map.get(s2.charAt(i)) + 1;
                s2Map.remove(s2.charAt(i));
                s2Map.put(s2.charAt(i), tmp2);
            } else {
                s2Map.put(s2.charAt(i), 1);
            }
        }
        if (s1Map.size() != s2Map.size()) {
            return false;
        }
        for (Character character : s1Map.keySet()) {
            if (!s1Map.get(character).equals(s2Map.get(character))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(CheckPermutation("asvnpzurz", "urzsapzvn"));
    }
}
