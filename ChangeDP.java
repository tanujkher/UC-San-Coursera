import java.util.Scanner;

public class ChangeDP {
    private static int getChange(int m, int[] strg) {
        if(m == 0){
            return 0;
        }
        if(m < 0){
            return 1000;
        }
        if(strg[m] != 0){
            return strg[m];
        }
        int c1 = getChange(m - 1, strg) + 1;
        int c3 = getChange(m - 3, strg) + 1;
        int c4 = getChange(m - 4, strg) + 1;
        strg[m] = Math.min(c1, Math.min(c3, c4));
        return strg[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] strg = new int[m + 1];
        System.out.println(getChange(m, strg));

    }
}

