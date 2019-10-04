public class LetterMapToNumber {
    public static void main(String args[]) {
        String data = "102";
        System.out.println(helper(data, data.length()));
    }

    static int helper(String data, int length) {
        if (length == 0) {
            return 1;
        }


        int s = data.length() - length;
        if (data.charAt(s) == '0') {
            return 0;
        }

        int result = helper(data, length - 1);
        if (length >= 2 && Integer.parseInt(data.substring(s, s + 2)) <= 26) {
            result += helper(data, length - 2);
        }

        return result;
    }
}
