package medium;

public class SwapSort {
    public static void main(String[] args) {
        int arr[] = {2,3,4,1,5};
        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
                count = count + swapCount(arr, i);
            }
        return count;
    }

    static int swapCount(int arr[], int index) {
        int count = 0;

        int target = arr[index] - 1;
        while(index != target) {
            int temp = arr[index];
            arr[index] = arr[target];
            arr[target] = temp;
            count++;
            target = arr[index] - 1;
        }
        return count;

    }
 }
