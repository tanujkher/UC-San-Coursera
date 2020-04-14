public class longestpalindromicsubstring{
    public static void main(String[] args) {
        String s = "bbbbabbbbddadda";
        if(s.length() == 0){
            System.out.println(s);
        }
        int max = 0;
        int si = -1;
        int ei = -1;
        for(int axis = 0; axis <= s.length() - 1; axis++){
            for(int orbit = 0; axis + orbit <= s.length() - 1 && axis - orbit >= 0; orbit++){
                if(s.charAt(axis + orbit) == s.charAt(axis - orbit)){
                    if(2 * orbit + 1 > max){
                        max = 2 * orbit;
                        si = axis - orbit;
                        ei = axis + orbit;
                    }
                }else{
                    break;
                } 
            }
        }
        for(double axis = 0.5; axis <= (double)(s.length() - 1); axis++){
            for(double orbit = 0.5; (int)(axis + orbit) <= s.length() - 1 && (int)(axis - orbit) >= 0; orbit++){
                if(s.charAt((int)(axis + orbit)) == s.charAt((int)(axis - orbit))){
                    if(2 * orbit + 1 > max){
                        max = (int)(2 * orbit);
                        si = (int)(axis - orbit);
                        ei = (int)(axis + orbit);
                    }
                }else{
                    break;
                }
            }
        }
        System.out.println(s.substring(si, ei + 1));
    }
}