package easy;

public class CountingValley {
    public static void main(String[] args) {
        int steps = 8;
        String seq = "DDUUUUDD";

        System.out.println(countingValleys(steps, seq));
    }


    static int countingValleys(int n, String s) {
        int count = 0;
        char[] steps = s.toCharArray();
        int atSeaLevel = 0;
        for(int i = 0; i < n; i++) {
            if(steps[i] == 'U') {
                atSeaLevel++;
            } else if(steps[i] == 'D') {
                atSeaLevel--;
            }

            if (atSeaLevel == 0) {
                count++;
            }
        }

        return count;
    }
}
