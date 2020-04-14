public class MaxPairwiseProduct{
    public static void main(String[] args) {
        while(true){
            int n = (int)(Math.random() * 10) + 2;
            long[] arr = new long[n];
            for(int i = 0; i <= arr.length - 1; i++){
                arr[i] = (int)(Math.random() * 100);
            }
            for(long val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            long na = Naive(arr);
            long mod = FindMaxProduct(arr);
            System.out.println(na + " " + mod);
            if(na != mod){
                System.out.println("Wrong answer");
                break;
            }else{
                System.out.println("OK");
            }
        }
    }

    private static long Naive(long[] arr){
        long result = 0;
        for(int i = 0; i <= arr.length - 1; i++){
            for(int j = i + 1; j <= arr.length - 1; j++){
                result = Math.max(result, arr[i] * arr[j]);
            }
        }
        return result;
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