package medium;

public class LongestPalindrone {
    public static void main(String[] args) {
        String s = "abcabba";
        System.out.println(longestPalidrone(s));
    }

    static int longestPalidrone(String s) {
        char[] chars = s.toCharArray();
        int highest = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (j > 0) {
                if (chars[i + 1] == chars[j - 1]) {
                    if(highest < i) {
                        highest = i;
                    }

                } else {
                    break;
                }
                j--;
            }

        }
        return highest;
    }
}
