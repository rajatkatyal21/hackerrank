public class ArrayManipulation {

    public static void main(String[] args) {
        int arr[][] = {{2, 6, 8}, {3, 5, 7}, {1, 8, 1}, {5, 9, 15}};
        int n = 10;
        System.out.println(arrayManipulation(n, arr));
    }

    static long arrayManipulation(int n, int[][] arr) {
        //Brute Force
        /*long targetArr[] = new long[n];

        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            int start = arr[i][j] - 1;
            j++;
            int end = arr[i][j] - 1;
            j++;
            int valToAdd = arr[i][j];

            for (int k = start; k <= end; k++) {
                targetArr[k] += valToAdd;
                if (targetArr[k] > highest) {
                    highest = targetArr[k];
                }
            }
        }*/

        //Prefix Sum algorithm
        long highest;
        long targetArr[] = new long[n + 1];

        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0] - 1;
            int end = arr[i][1] - 1;
            int valToAdd = arr[i][2];

            targetArr[start] += valToAdd;
            targetArr[end + 1] -= valToAdd;
        }

        highest = targetArr[0];
        for (int i = 1; i < n + 1; i++) {
            targetArr[i] = targetArr[i] + targetArr[i - 1];
            if(targetArr[i] > highest) {
                highest = targetArr[i];
            }
        }

        return highest;
    }
}
