import java.util.*;

public class LCS2 {

    private static int lcs2(int[] a, int[] b, int ai, int bi, int[][] strg) {
        if(ai == a.length || bi == b.length){
            return 0;
        }
        if(strg[ai][bi] != -1){
            return strg[ai][bi];
        }
        if(a[ai] == b[bi]){
            strg[ai][bi] = lcs2(a, b, ai + 1, bi + 1, strg) + 1;
            return strg[ai][bi];
        }
        int a1 = lcs2(a, b, ai + 1, bi, strg);
        int a2 = lcs2(a, b, ai, bi + 1, strg);
        strg[ai][bi] = Math.max(a1, a2);
        return strg[ai][bi];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        int[][] strg = new int[a.length + 1][b.length + 1];
        for(int[] val : strg){
            Arrays.fill(val, -1);
        }
        System.out.println(lcs2(a, b, 0, 0, strg));
    }
}

