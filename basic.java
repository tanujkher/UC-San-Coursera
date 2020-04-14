// import java.util.Scanner;

public class basic{
    public static void main(String[] args){
        System.out.println(oddEven(2));
        System.out.println(oddEven(1));

        System.out.println(fibonacci(10));
        System.out.println(fibonacci(100));

        System.out.println(hcf(100, 200));
    }

    private static boolean oddEven(int a){
        return a % 2 == 0 ? true : false;
    }

    // private static long fibonacciRecursion(int n, long[] strg){
    //     if(n == 0 || n == 1){
    //         return n;
    //     }
    //     if(strg[n] != 0){
    //         return strg[n];
    //     }
    //     strg[n] = fibonacciRecursion(n - 1, strg) + fibonacciRecursion(n - 2, strg);
    //     return strg[n];
    // }

    private static long fibonacci(int n){
        long a = 0;
        long b = 1;
        while(n != 0){
            long temp = a + b;
            a = b;
            b = temp;
            n--;
        }
        return b;
    }

    private static int hcf(int a, int b){
        while(a % b != 0){
            int temp = a % b;
            a = b;
            b = temp; 
        }
        return b;
    }
}