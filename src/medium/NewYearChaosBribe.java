package medium;

import java.util.Map;

public class NewYearChaosBribe {

    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4};
        System.out.println(minimumBribes(arr));
    }

    // Complete the minimumBribes function below.
    static String minimumBribes(int[] q) {
        //sorting algorithm
        int sum = 0;
        int check[] = new int[q.length];
        for (int i = 0; i < q.length - 1; i++) {
            for (int j = 0; j < q.length - 1 - i; j++) {
                if (q[j] > q[j + 1]) {
                    check[q[j] - 1]++;
                    if(check[q[j] - 1] > 2) {
                        return "Too chaotic";
                    }
                    int temp = q[j];
                    q[j] = q[j + 1];
                    q[j + 1] = temp;
                    sum++;
                }
            }
        }
        return Integer
                .valueOf(sum)
                .toString();

    }
}

