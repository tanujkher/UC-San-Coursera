import java.util.*;

public class Knapsack {
    static int optimalWeight(int W, int[] w, int curr, int[][] strg) {
      if(W < 0){
        return Integer.MIN_VALUE;
      }
      if(W == 0 || curr == w.length){
        return 0;
      }
      if(strg[W][curr] != 0){
        return strg[W][curr];
      }
      int inc = optimalWeight(W - w[curr], w, curr + 1, strg) + w[curr];
      int exc = optimalWeight(W, w, curr + 1, strg);
      strg[W][curr] =  Math.max(inc, exc);
      return strg[W][curr];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int[][] strg = new int[W + 1][w.length + 1];
        System.out.println(optimalWeight(W, w, 0, strg));
    }
}

