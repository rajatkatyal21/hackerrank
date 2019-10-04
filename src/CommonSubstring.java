import java.util.HashMap;
import java.util.Map;

public class CommonSubstring {

    public static void main(String[] args) {
        System.out.println(twoStrings("hello", "world"));
    }

    static String twoStrings(String s1, String s2) {
        char s1Chars[] = s1.toCharArray();
        char s2Chars[] = s2.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s1Chars.length; i++) {
            Integer count= map.get(s1Chars[i]);
            int val = count == null ? 0: ++count;
            map.put(s1Chars[i], val);
        }

        for(int i = 0; i < s2Chars.length; i++) {
            if(map.get(s2Chars[i]) != null) {
                return "YES";
            }
        }

        return "NO";

    }
}
