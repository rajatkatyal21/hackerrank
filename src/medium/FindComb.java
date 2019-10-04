package medium;

import java.util.ArrayList;
import java.util.List;

public class FindComb {

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(findComb(str, str.length()));
    }

    private static int findComb(String str, int n) {
        int count = 0;
        for (int length = 1; length < n; length++) {
            List<String> ls = new ArrayList<>();
            for (int j = 0; j <= n - length; j++) {
                ls.add(str.substring(j, length + j));
            }
            for(int i= 0; i <  ls.size(); i++) {
                for(int j = i+1; j < ls.size(); j++) {
                    if(checkAnagram(ls.get(i), ls.get(j))) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean checkAnagram(String substring, String substring1) {

        int h[] = new int[26];
        for(int i = 0; i < substring.length(); i++) {
            h[substring.charAt(i) -'a']++;
        }
        for(int i = 0; i < substring1.length(); i++) {
            h[substring1.charAt(i) -'a']--;
        }

        for(int i =0; i<h.length;i++) {
            if(h[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
