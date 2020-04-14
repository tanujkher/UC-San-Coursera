import java.util.*;

// fn >= 2^(n/2) for n >= 6

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fib(n));
    }
    
    private static int fib(int n){
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++){
            int temp = a + b;
            a = b;
            b = temp;
        }
        return a;
    }
}