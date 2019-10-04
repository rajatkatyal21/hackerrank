package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        String a = "cde";
        String b = "abc";

        System.out.println(makeAnagram(a, b));

    }

    static int makeAnagram(String a, String b) {
        char[] aChars = a.toCharArray();
        Arrays.sort(aChars);
        char[] bChars = b.toCharArray();
        Arrays.sort(bChars);

        int count = 0;
        int i = 0;
        int j = 0;
        while (i < aChars.length && j < bChars.length) {
            if(aChars[i] == bChars[j]) {
                i++;
                j++;
            } else if(aChars[i] > bChars[j]) {
                j++;
                count++;
            } else {
                i++;
                count++;
            }

        }

        if(i == aChars.length) {
            count = count + bChars.length - j;
        } else if(j == bChars.length) {
            count = count + aChars.length - i;
        }

        return count;

    }

}
