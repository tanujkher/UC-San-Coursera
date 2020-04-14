import java.util.*;

public class MaxPairwiseProduct{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[n];
        for(int i = 0 ; i <= n - 1; i++){
            arr[i] = scn.nextLong();
        }
        System.out.println(FindMaxProduct(arr));
        scn.close();
    }
    private static long FindMaxProduct(long[] arr){
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        int idx = -1;
        for(int i = 0; i <= arr.length - 1; i++){
            if(max1 < arr[i]){
                max1 = arr[i];
                idx = i;
            }
        }
        arr[idx] = Integer.MIN_VALUE;
        for(int i = 0; i <= arr.length - 1; i++){
            if(max2 < arr[i]){
                max2 = arr[i];
            }
        }
        return max1 * max2;
    }
}