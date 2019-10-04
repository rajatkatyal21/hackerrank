package easy;

public class AlternationCharacters {

    public static void main(String[] args) {
        String s = "AABAAB";
        System.out.println(alternatingCharacters(s));

    }

    static int alternatingCharacters(String s) {
        int count = 0;
        char chars[] = s.toCharArray();
        for(int i = 0; i < chars.length - 1 ; i++) {
            if(chars[i] == chars[i+1]) {
                count++;
            }
        }
        return count;
    }
}
