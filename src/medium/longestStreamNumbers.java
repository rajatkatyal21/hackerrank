package medium;

import java.util.Scanner;

public class longestStreamNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String[] arr = inputString.split(",");

        int size = arr.length;
        int max = Integer.MIN_VALUE, max_till = 0;

        for (int i = 0; i < size; i++) {
            try {
                Integer.parseInt(arr[i]);
            } catch (NumberFormatException | NullPointerException nfe) {
                System.out.println(0);
                return;
            }

            max_till = max_till + Integer.valueOf(arr[i].trim());
            if (max < max_till)
                max = max_till;
            if (max_till < 0)
                max_till = 0;
        }

        System.out.println(max);

    }
}
