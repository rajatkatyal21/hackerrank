public class ArrayLeftRotation {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        rotLeft(a, 4);
    }

    static int[] rotLeft(int[] a, int d) {
        int rota[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i - d < 0) {
                rota[a.length + i - d] = a[i];
            } else {
                rota[i-d] = a[d];
            }
        }
        return rota;
    }

}
