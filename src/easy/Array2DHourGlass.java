package easy;

public class Array2DHourGlass {

    public static void main(String[] args) {
        int arr[][] =
                {
                        {-1, -1, 0, -9, -2, -2},
                        {-2, -1, -6, -8, -2, -5},
                        {-1, -1, -1, -2, -3, -4},
                        {-1, -9, -2, -4, -4, -5},
                        {-7, -3, -3, -2, -9, -9},
                        {-1, -3, -1, -2, -4, -5}};

        System.out.println(hourglassSum(arr));

    }

    static int hourglassSum(int[][] arr) {
        int highest = Integer.MIN_VALUE;
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                if (k + 3 <= arr.length && l + 3 <= arr[k].length) {
                    int sum = hourGlassSum(arr, k, l);
                    if (sum > highest) {
                        highest = sum;
                    }
                }

            }
        }
        return highest;
    }

    private static int hourGlassSum(int[][] arr, int k, int l) {
        int sum = 0;
        for (int i = k; i < k + 3; i++) {
            for (int j = l; j < l + 3; j++) {
                if (i == k + 1 && (j == l || j == l + 2)) {

                } else {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

}
