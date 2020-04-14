import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n ; i++){
            int temp = a + b;
            a = b;
            b = temp;
            a = a % 10;
            b = b % 10;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

