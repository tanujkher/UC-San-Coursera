import java.util.*;

public class Inversions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count = 0;
        for(int i = 0; i <= a.length - 1; i++){
            for(int j = i + 1; j <= a.length - 1; j++){
                if(a[i] > a[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

