import java.util.*;

// 950
// 400
// 4
// 200 375 550 750

public class CarFueling {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dist = scn.nextInt();
        int cap = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n + 2];
        arr[0] = 0;
        for(int i = 1; i <= n; i++){
            arr[i] = scn.nextInt();
        }
        arr[arr.length - 1] = dist;
        System.out.println(minFill(dist, cap, arr));
    }

    private static int minFill(int dist, int cap, int[] arr) {
        int refil = 0;
        for(int i = 0; i <= arr.length - 1;){
            int curr = i;
            for(; i + 1 <= arr.length - 1 && arr[i + 1] - arr[curr] <= cap;){
                i++;
            }
            if(i == arr.length - 1){
                return refil;
            }
            if(i == curr){
                return -1;
            }
            if(i <= arr.length - 1){
                refil++;
                // System.out.println("refil at " + i + "  no " + refil);
            }
        }
        return refil;
    }
}
