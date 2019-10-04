package medium;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class checkDuplicacy {

    public static void main(String[] args) {
        String s = "aabbcd";
        System.out.println(isValid(s));
    }

    static String isValid(String s) {
        char[] chars = s.toCharArray();

        int count = 0;

        Map<Character, Integer> map = new HashMap();
        for(int i = 0; i < chars.length; i++) {
            Integer occurence = map.get(chars[i]) == null ? 0 : map.get(chars[i]);
            map.put(chars[i], ++occurence);
        }

        Collection<Integer> values = map.values();
        Iterator<Integer> iterator = values.iterator();
        int lastVal = iterator.next();
        int removed = 0;
       while (iterator.hasNext()) {
           int current = iterator.next();
           if(lastVal == current) {
               continue;
           } else if(Math.abs(current - lastVal) > 1 || removed > 1) {
               return "NO";
           } else {
               removed++;
           }


       }
        if(removed > 1) {
            return "NO";
        }

        return "YES";
    }
}
