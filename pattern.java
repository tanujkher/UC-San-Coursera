import java.util.ArrayList;

public class pattern{
    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            int curr = n;
            ArrayList<Integer> arr = new ArrayList<>();
            int count = i - 1;
            for(int j = 1; j <= n; j++){
                if(count > 0 && j != 1){
                    curr--;
                    count--;
                }
                arr.add(curr);
            }
            ans.add(arr);
        }
        for(int i = 0; i <= ans.size() - 1; i++){
            doubleArrR(ans.get(i));
        }
        for(int i = 0; i <= ans.size() - 1; i++){
            for(int val : ans.get(i)){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        for(int i = ans.size() - 2; i >= 0; i--){
            for(int val : ans.get(i)){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    private static void doubleArrR(ArrayList<Integer> curr){
        ArrayList<Integer> rev = new ArrayList<>();
        for(int i = curr.size() - 2; i >= 0; i--){
            rev.add(curr.get(i));
        }
        for(int val : rev){
            curr.add(val);
        }
    }
}