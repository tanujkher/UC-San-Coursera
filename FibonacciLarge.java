import java.util.*;

public class FibonacciLarge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long m = scn.nextLong();
        System.out.println(getFib(n, m));
    }

    private static long getFib(long n, long m){
        // n = 2015, m = 3, m period = 8, 2015 = 251 * 8 + 7, res = 7 
        long period = getPeriod(m);
        long res = n % period;
        long a = 0;
        long b = 1;
        for(int i = 1; i <= res; i++){
            long temp = (a + b) % m;
            a = b;
            b = temp;
        }
        return a;
    }

    private static long getPeriod(long m){
        long a = 0;
        long b = 1;
        for(int i = 0; i < m * m; i++){
            long temp = (a + b) % m;
            a = b;
            b = temp;
            if(a == 0 && b == 1){
                return i + 1;
            }
        }
        return -1; // never reach here
    }
}