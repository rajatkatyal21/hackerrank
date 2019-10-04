package easy;

public class JumpingOnclouds {

    public static void main(String[] args) {
        int c[] = {0,0,0,0,1,0};

        System.out.println(jumps(c));
    }

    private static int jumps(int[] c) {
        int start = 0;
        boolean jump = true;
        int count = 0;
        while(jump) {
            if((start + 2) < c.length && c[start + 2] == 0 ) {
                count++;
                start = start + 2;
            } else if((start + 1) < c.length && c[start + 1] == 0) {
                count++;
                start = start + 1;
            }
            if(start == c.length - 1) {
                jump = false;
            }

        }

        return count;
    }
}
