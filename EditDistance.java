import java.util.*;

class EditDistance {
  public static int EditDistance(String s, String t, int[][] strg) {
    if(s.length() == 0 || t.length() == 0){
      return Math.max(s.length(), t.length());
    }
    if(strg[s.length()][t.length()] != 0){
      return strg[s.length()][t.length()];
    }
    String ros = s.substring(1);
    String rot = t.substring(1);
    if(s.charAt(0) == t.charAt(0)){
      return EditDistance(ros, rot, strg);
    }
    int ins = EditDistance(s, rot, strg) + 1; 
    int del = EditDistance(ros, t, strg) + 1;
    int sub = EditDistance(ros, rot, strg) + 1;
    strg[s.length()][t.length()] = Math.min(ins, Math.min(del, sub));
    return strg[s.length()][t.length()];
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();
    int[][] strg = new int[s.length() + 1][t.length() + 1];
    System.out.println(EditDistance(s, t, strg));
  }

}
