import java.util.*;

// 0 1 1 2 3 5 8 13 21 34 55 89 
// 0 1 2 4 7 2 0 3 4 8 3 2
// S(n) = f(n + 2) - 1

public class FibonacciLastDigit {
    private static void getFibonacciLastDigitNaive(int n) {
        int[] arr = new int[n + 1];
        arr[1] = 1;
        for(int i = 2; i <= arr.length - 1; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
        int[] sum = new int[n + 1];
        sum[1] = 1;
        for(int i = 2; i <= arr.length - 1; i++){
            sum[i] = sum[i - 1] + arr[i];
        }
        System.out.println();
        for(int val : sum){
            System.out.print((val % 10) + " ");
        }
    }

    private static long lastDig(long n){
        long a = 0;
        long b = 1;
        long sum = 0;
        for(long i = 0; i < n; i++){
            long temp = (a + b) % 10;
            a = b;
            b = temp;
            sum = sum + a;
            sum = sum % 10;
            System.out.print(sum + " ");
        }
        System.out.println();
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        getFibonacciLastDigitNaive((int)n);
        // System.out.println();
        // System.out.println(lastDig(n));
    }
}

