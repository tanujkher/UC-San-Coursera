import java.util.*;

public class FibonacciPartialSum{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        long from = scn.nextLong();
        long to = scn.nextLong();
        if(from == to){
            System.out.println(fibSameNum(from));
        }else{
            long remf = fibSameNum((from + 1) % 60) - 1;
            long remt = fibSameNum((to + 2) % 60) - 1;
            if(remt > remf){
                System.out.println(remt - remf);
            }else if(remt < remf){
                System.out.println(remt - remf + 10);
            }else{
                System.out.println(0);
            }
        }
    }
    
    private static long fibSameNum(long num){
        // long period = getPeriod(10);
        long rem = num % 60;
        long a = 0;
        long b = 1;
        for(int i = 1; i <= rem; i++){
            long temp = (a + b) % 10;
            a = b;
            b = temp;
        }
        return a;
    }

    // private static long getPeriod(long m){
    //     long a = 0;
    //     long b = 1;
    //     for(int i = 0; i < m * m; i++){
    //         long temp = (a + b) % m;
    //         a = b;
    //         b = temp;
    //         if(a == 0 && b == 1) return i + 1;
    //     }
    //     return -1;
    // }
}