package easy;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SockMerchant {

    public static void main(String[] args) {
        int numberOfSocks = 9;
        int ar[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(sockMerchant(ar));
    }

    private static int sockMerchant(int[] ar) {

        Map<Integer, Long> sockCountMap = Arrays
                .stream(ar)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return (int)sockCountMap
                .values()
                .stream()
                .mapToDouble(aLong -> Math.floor(aLong / 2))
                .sum();

    }
}
