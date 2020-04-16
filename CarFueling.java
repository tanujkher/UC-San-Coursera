import java.util.*;

public class CarFueling {
    private static int computeMinRefills(int dist, int tank, int[] stops) {
        int fills = 0;
        int last_fill = 0;
        for(int i = 0; i <= stops.length - 1; i++){
            int next = i + 1 <= stops.length - 1 ? stops[i + 1] : -1;
            if(next == -1){
                if(last_fill + tank >= dist){
                    return fills;
                }
            }
            if(tank - next < 0){
                last_fill = stops[i];
                fills = fills + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }
        stops[stops.length - 1] = dist;
        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
