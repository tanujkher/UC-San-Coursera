import java.util.*;

// 3 50
// 60 20
// 100 50
// 120 30

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        HashMap<Double, List<Integer>> map = new HashMap<>();
        for(int i = 0; i <= values.length - 1; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(values[i]);
            curr.add(weights[i]);
            map.put((values[i] / (weights[i] * 1.0)), curr);
        }
        ArrayList<Double> ks = new ArrayList<>(map.keySet());
        Collections.sort(ks);
        for(int i = ks.size() - 1; i >= 0; i--){
            if(capacity == 0){
                break;
            }
            int weight = map.get(ks.get(i)).get(1);
            int val = map.get(ks.get(i)).get(0);
            if(weight > capacity){
                value = value + ((capacity / (weight * 1.0)) * (val * 1.0));
                break;
            }else{
                value = value + (val * 1.0);
                capacity = capacity - weight;
            }
        }
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
