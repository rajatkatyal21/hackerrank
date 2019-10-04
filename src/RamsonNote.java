import java.util.HashMap;
import java.util.Map;

public class RamsonNote {

    public static void main(String[] args) {
        String[] magazine = {"give", "me", "one", "grand", "night"};
        String[] note = {"give", "one", "one", "night"};
        checkMagazine(magazine, note);
    }

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length; i++) {
            Integer integer = map.get(magazine[i]);
            map.put(magazine[i], map.get(magazine[i]) == null ? 1 : ++integer);
        }

        for(int i = 0; i < note.length; i++) {
            Integer integer = map.get(note[i]);
            if(integer == null || integer == 0) {
                System.out.print("No");
                return;
            }

            map.put(note[i], --integer);

        }

        System.out.print("Yes");
    }

}
