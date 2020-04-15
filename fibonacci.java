import java.util.*;

// fn >= 2^(n/2) for n >= 6

public class fibonacci {
    public static void main(String[] args) {
        // while(true){
        //     long n = (long)(Math.random() * 10);
        //     long m = (long)(Math.random() * 10) + 1;
        //     long fib_huge = fib(n, m);
        //     long fib_nor = fibn(n, m);
        //     System.out.println(n + " " + m);
        //     System.out.println(fib_huge + " " + fib_nor);
        //     if(fib_huge == fib_nor){
        //         System.out.println("OK");
        //     }else{
        //         System.out.println("Wrong");
        //         break;
        //     }
        // }
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long m = scn.nextLong();
        System.out.println(fib(n, m));
    }

    private static long fibn(long n, long m){
        long a = 0;
        long b = 1;
        for(int i = 1; i <= n; i++){
            long temp = a + b;
            a = b;
            b = temp;            
        }
        return a % m;
    }
    
    private static long fib(long n, long m){
        long a = 0;
        long b = 1;
        for(int i = 1; i <= n; i++){
            long temp = a + b;
            a = b;
            b = temp;
            a = a % m;
            b = b % m;
        }
        return a;
    }
}