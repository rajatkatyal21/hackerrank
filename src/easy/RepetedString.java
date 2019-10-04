package easy;

public class RepetedString {

    public static void main(String[] args) {
        String s =
                "aba";
        long n = 10;

        System.out.println(repeatedString(s, n));

    }

    static long repeatedString(String s, long n) {
        int count = 0;
        char[] chars = s.toCharArray();
        if(chars.length == 1 && chars[0] == 'a') {
            return n;
        }

        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == 'a') {
                count++;
            }
        }
        long rem = n % s.length();
        long numberOfAs = (n - rem)/s.length() * count;

        for(int i = 0; i < rem; i++) {
            if (chars[i] == 'a') {
                numberOfAs++;
            }
        }

        return numberOfAs;
    }

}
