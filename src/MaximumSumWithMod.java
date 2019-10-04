public class MaximumSumWithMod {

    public static void main(String[] args) {
        long a[] = {1, 2, 3};
        int m = 2;
        System.out.println(maximumSum(a, m));
    }


    static long maximumSum(long[] a, long m) {
        long maxSum = 0;
        long highest = Long.MIN_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(a[i]%m > (maxSum+a[i])%m) {
                maxSum = a[i];
            } else {
                maxSum = maxSum+a[i];
            }

            if(maxSum%m > highest) {
                highest = maxSum%m;
            }
        }
        return highest;
    }

}
