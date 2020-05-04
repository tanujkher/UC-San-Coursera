import java.io.*;
import java.util.*;

public class Sorting {
    private static int[] randomizedQuickSort(int[] a, int l, int r) {
        if(l >= r){
            int[] base = new int[1];
            base[0] = a[l]; 
            return base;
        }
        int mid = (l + r) / 2;
        int[] al = randomizedQuickSort(a, l, mid);
        int[] ar = randomizedQuickSort(a, mid + 1, r);
        return MergeTwoSA(al, ar);
    }

    private static int[] MergeTwoSA(int[] al, int[] ar) {
        int[] ans = new int[al.length + ar.length];
        int i = 0; 
        int j = 0;
        int k = 0;
        for(; i <= al.length - 1 && j <= ar.length - 1;){
            if(al[i] < ar[j]){
                ans[k] = al[i];
                i++;
                k++;
            }else if(ar[j] <= al[i]){
                ans[k] = ar[j];
                j++;
                k++;
            }
        }
        if(i != al.length){
            while(i <= al.length - 1){
                ans[k] = al[i];
                i++;
                k++;
            }
        }
        if(j != ar.length){
            while(j <= ar.length - 1){
                ans[k] = ar[j];
                j++;
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] ans = randomizedQuickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

