package medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        /*String[] s1 = {"two", "times", "three", "is", "not", "four"};
        String[] s2 = {"two", "times", "two", "is", "four"};
        checkMagazine(s1, s2);*/
        int ex[] = {10,20,30,40,50};
        System.out.println(activityNotifications(ex, 3));
    }

  /*  static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length; i++) {
            map.put(magazine[i], getWordCount(map.get(magazine[i])));
        }

        for (int i = 0; i < note.length; i++) {
            if (map.get(note[i]) == null || map.get(note[i]) < 1) {
                System.out.print("No");
                return;
            }
            Integer newVal = map.get(note[i]);
            map.put(note[i], newVal);
        }

        System.out.print("Yes");

    }

    private static Integer getWordCount(Integer integer) {
        System.out.println(Math.); return integer == null
                ? 1
                : integer;

    }
*/
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> rs = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, List<Integer>> counts = new HashMap<>();
        for (int i = 0; i < queries.size(); i++) {
            Integer op = queries
                    .get(i)
                    .get(0);
            Integer val = queries
                    .get(i)
                    .get(1);

            if (op == 1) {
                int v = map.get(val) == null
                        ? 0
                        : map.get(val);
                ++v;
                map.put(val, v);
                List<Integer> ls = counts.get(v) == null
                        ? new ArrayList<>()
                        : counts.get(v);
                ls.add(val);
                counts.put(v, ls);
            } else if (op == 2) {
                if (map.get(val) == null) {
                    continue;
                } else {
                    Integer v = map.get(val);
                    counts
                            .get(v)
                            .remove(val);
                    --v;
                    map.put(val, v);
                    List<Integer> ls = counts.get(v) == null
                            ? new ArrayList<>()
                            : counts.get(v);
                    ls.add(val);
                    counts.put(v, ls);

                }
            } else if (op == 3) {
                rs.add(counts.get(val) != null
                        ? 1
                        : 0);
            }
        }

        return rs;
    }

    static long countTriplets(List<Long> arr, long r) {

        Map<Long, Integer> before = new HashMap<>();
        Map<Long, Integer> after = new HashMap<>();

        int result = 0;
        //Before is the map with frequency
        //After is initialized
        for (int i = 0; i < arr.size(); i++) {
            int occ = before.get(arr.get(i)) == null
                    ? 0
                    : before.get(arr.get(i));
            before.put(arr.get(i), ++occ);
            after.put(arr.get(i), 0);
        }

        for (int i = 0; i < arr.size(); i++) {    //arr[i] = 2
            Long n2 = arr.get(i);
            before.put(n2, before.get(n2) - 1);

            if (n2 % r == 0) {
                long n1 = n2 / r;   // 1
                long n3 = n2 * r;  // 4

                if (before.containsKey(n1) && before.containsKey(n2)) {
                    result = result + (before.get(n3) * after.get(n1));
                }
            }

            after.put(n2, after.get(n2) + 1);
        }

        return result;
    }

    static int activityNotifications(int[] expenditure, int d) {
        int notice = 0;
        for (int i = 0; i < expenditure.length -d ; i++) {
            double totalExpenditure = 0;
            for (int j = i; j < d; j++) {
                totalExpenditure += expenditure[j];
            }
            double median = getMedian(totalExpenditure, d);
            if (median * 2 <= expenditure[i + d]) {
                notice++;
            }

        }
        return notice;

    }

    static double getMedian(double totalExpenditure, int d) {
        return Math.ceil(totalExpenditure / d);

    }
}
