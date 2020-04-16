import java.util.Scanner;

public class Change {
    private static long getChange(long m) {
        long count = 0;
        count = count + (m / 10);
        m = m % 10;
        count = count + (m / 5);
        m = m % 5;
        return count + m;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long m = scn.nextLong();
        System.out.println(getChange(m));
    }
}

