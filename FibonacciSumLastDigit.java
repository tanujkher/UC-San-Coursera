import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        // long period = getPeriod(10);
        // return period;
        long rem = (n + 2) % 60; // F(n + 2)
        long a = 0;
        long b = 1;
        for(int i = 1; i <= rem; i++){
            long temp = (a + b) % 10;
            a = b;
            b = temp;
        }
        return a == 0 ? 9 : a - 1; // as S(n) = F(n + 2) - 1 
    }

    // private static long getPeriod(long n){
    //     long a = 0;
    //     long b = 1;
    //     for(int i = 0; i < n * n; i++){
    //         long temp = (a + b) % n;
    //         a = b;
    //         b = temp;
    //         if(a == 0 && b == 1) return i + 1;
    //     }
    //     return -1;
    // }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long s = getFibonacciSumNaive(n);
        System.out.println(s);
    }
}

