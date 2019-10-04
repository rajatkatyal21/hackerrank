package easy;

public class ArraysLeftRotation {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int rotation = 4;

        System.out.println(rotLeft(arr, rotation));
    }

    static int[] rotLeft(int[] a, int d) {
        int temp[] = new int[d];

        for(int i = 0; i < d; i++) {
            temp[i] = a[i];
        }
        int pos = 0;
        for(int i = d; i < a.length; i++) {
            a[pos] = a[d];
            pos++;
        }

        int tempPos = 0;
        for(int i = pos; i < a.length; i++) {
            a[i] = temp[tempPos];
            tempPos++;
        }

        return a;
    }

}
