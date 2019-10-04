public class Add1ToArray {

    public static void main(String[] args) {
        int num[] = {9, 9, 1};
        System.out.println(add(num));
    }

    private static long add(int[] num) {
        long multiple = 1;
        long sum = 0;


        for (int i = num.length - 1; i >= 0; i--) {
            sum = sum + (num[i] * multiple);
            multiple *= 10;
        }
        return sum + 1;
    }

}
