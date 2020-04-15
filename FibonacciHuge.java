import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        long period = getPeriod(m);
        // System.out.println("Period is " + period);
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
        // System.out.println("In get period");
        long a = 0;
        long b = 1;
        for(int i = 0; i < m * m; i++){
            long temp = (a + b) % m;
            a = b;
            b = temp;
            if(a == 0 && b == 1) return i + 1;
            // System.out.println(a);
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}

