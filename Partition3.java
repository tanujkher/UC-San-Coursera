import java.util.*;
import java.io.*;

public class Partition3 {
    private static boolean partition3(int[] A, int gp1, int gp2, int gp3, int curr, HashMap<ArrayList<Integer>, Boolean> map) {
        if(curr == A.length){
            if(gp1 == gp2 && gp2 == gp3){
                return true;
            }else{
                return false;
            }
        }
        ArrayList<Integer> cgp = new ArrayList<>();
        cgp.add(gp1);
        cgp.add(gp2);
        cgp.add(gp3);
        cgp.add(curr);
        if(map.containsKey(cgp)){
            return map.get(cgp);
        }
        boolean g1 = partition3(A, gp1 + A[curr], gp2, gp3, curr + 1, map);
        boolean g2 = partition3(A, gp1, gp2 + A[curr], gp3, curr + 1, map);
        boolean g3 = partition3(A, gp1, gp2, gp3 + A[curr], curr + 1, map);
        map.put(cgp, g1 || g2 || g3);
        return map.get(cgp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        HashMap<ArrayList<Integer>, Boolean> map = new HashMap<>();
        System.out.println(partition3(A, 0, 0, 0, 0, map) ? 1 : 0);
    }
}

