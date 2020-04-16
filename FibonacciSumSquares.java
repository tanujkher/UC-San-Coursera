import java.util.*;

public class FibonacciSumSquares {
    // private static void getFibonacciSumSquaresNaive(long n) {
    //     long[] arr = new long[(int)n + 1];
    //     arr[0] = 0;
    //     arr[1] = 1;
    //     System.out.println(0 + " " + 1 + " ");
    //     for(int i = 2; i <= arr.length - 1; i++){
    //         arr[i] = arr[i - 1] + arr[i - 2];
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    //     for(int i = 0; i <= arr.length - 1; i++){
    //         arr[i] = arr[i] * arr[i];
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    //     long sum = 0;
    //     for(int i = 0; i <= arr.length - 1; i++){
    //         sum = sum + arr[i];
    //         sum = sum % 10;
    //         System.out.print(sum + " ");
    //     }
    // }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        getFibonacciSumSquaresNaive(n);
    }

    private static void getFibonacciSumSquaresNaive(long n) {
        long nth = getFib(n % 60);
        long nm1 = getFib((n - 1) % 60);
        System.out.println(((nth + nm1) * nth) % 10);
    }

    private static long getFib(long n){
        long a = 0;
        long b = 1;
        for(int i = 1; i <= n; i++){
            long temp = (a + b) % 10;
            a = b;
            b = temp;
        }
        return a;
    }
}

