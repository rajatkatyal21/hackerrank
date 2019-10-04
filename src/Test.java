import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        int h1[] = new int[26];

        String s1 = "ahi";
        String s2 = "hat";

        if(s1.length()!= s2.length()) {
            System.out.println(false);
            return;
        }
        for(int i = 0; i< s1.length(); i++) {
            h1[s1.charAt(i)-'a']++;
        }

        for(int i = 0; i< s2.length(); i++) {
            h1[s2.charAt(i)-'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if(h1[i] != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);

    }

}
