public class knapsack{
    public static void main(String[] args){
        int[] val = { 1, 4, 5, 7 };
        int[] wt = {1, 3, 4, 5};
        int W = 7;
        int[][] strg = new int[W + 1][val.length + 1];
        System.out.println(KnapTD(val, wt, W, 0, strg));
    }
    private static int KnapTD(int[] val, int[] wt, int W, int curr, int[][] strg){
        if(W < 0){
            return Integer.MIN_VALUE;
        }
        if(curr == val.length){
            return 0;
        }
        if(strg[W][curr] != 0){
            return strg[W][curr];
        }
        int inc = KnapTD(val, wt, W - wt[curr], curr + 1, strg) + val[curr];
        int exc = KnapTD(val, wt, W, curr + 1, strg);
        strg[W][curr] = Math.max(inc, exc);
        return strg[W][curr];
    }
}