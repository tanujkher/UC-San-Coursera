import java.util.*;

public class GCD {
  // private static int gcd(int a, int b) {
  //   int n = a + b;
  //   int ans = 1;
  //   for(int i = 2; i <= n; i++){
  //     if(a % i == 0 && b % i == 0){
  //       ans = Math.max(ans, i);
  //     }
  //   }
  //   return ans;
  // }

  private static long gcd(long a, long b){
    while(a % b != 0){
      long temp = a % b;
      a = b;
      b = temp;
    }
    return b;
  }

  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    long a = scn.nextInt();
    long b = scn.nextInt();
    System.out.println((a * b) / gcd(a, b));
    scn.close();
  }
}
