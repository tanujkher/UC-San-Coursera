import java.util.*;

public class GCD {
  // private static int gcd(int a, int b) {
  //   int n = Math.min(a, b);
  //   int ans = 1;
  //   for(int i = 2; i <= n; i++){
  //     if(a % i == 0 && b % i == 0){
  //       ans = Math.max(ans, i);
  //     }
  //   }
  //   return ans;
  // }

  private static int gcd(int a, int b){
    while(a % b != 0){
      int temp = a % b;
      a = b;
      b = temp;
    }
    return b;
  }

  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    System.out.println(gcd(a, b));
    scn.close();
  }
}
