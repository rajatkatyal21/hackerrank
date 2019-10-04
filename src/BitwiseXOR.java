public class BitwiseXOR {

    public static void main(String[] args) {

        int M = 12;
        int N = 25;

        int result = solution(M, N);
        System.out.println(result);
    }

    public static int solution(int m, int n) {
        int[] patternTracker;

        if(m % 2 == 0)
            patternTracker = new int[] {n, 1, n^1, 0};
        else
            patternTracker = new int[] {m, m^n, m-1, (m-1)^n};

        return patternTracker[(n-m) % 4];
    }
}
