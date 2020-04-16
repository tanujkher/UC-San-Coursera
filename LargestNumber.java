import java.util.*;

public class LargestNumber {
    private static String largestNumber(int[] a) {
        for(int i = 0; i <= a.length - 1; i++){
            for(int j = i + 1; j <= a.length - 1; j++){
                if(isLarger(i, j, a)){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        String result = "";
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

    private static boolean isLarger(int i, int j, int[] arr){
        String s1 = "" + arr[i] + arr[j];
        String s2 = "" + arr[j] + arr[i];
        return Integer.parseInt(s1) < Integer.parseInt(s2); 
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        System.out.println(largestNumber(a));
    }
}

