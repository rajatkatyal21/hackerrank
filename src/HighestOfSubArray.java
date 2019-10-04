public class HighestOfSubArray {

    public static void main(String[] args) {
        int i[] = {1, -3, 2, 1, -1};
        System.out.println(sumArraySum(i));

    }

    static int sumArraySum(int[] arr) {
        int highestArrSum = Integer.MIN_VALUE;
        int currentSum = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            if (highestArrSum < currentSum) {
                highestArrSum = currentSum;
            }
        }
        return highestArrSum;
    }
}
