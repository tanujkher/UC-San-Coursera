import java.util.*;

public class CoveringSegments {

    private static int[] optimalPoints(Segment[] segments) {
        for(int i = 0; i <= segments.length - 1; i++){
            for(int j = i + 1; j <= segments.length - 1; j++){
                if(segments[i].end > segments[j].end){
                    Segment temp = segments[i];
                    segments[i] = segments[j];
                    segments[j] = temp;
                }
            }
        }
        ArrayList<Integer> intersection = new ArrayList<>();
        int curr = segments[0].end;
        intersection.add(curr);
        for(int i = 1; i <= segments.length - 1; i++){
            if(curr < segments[i].start || curr > segments[i].end){
                curr = segments[i].end;
                intersection.add(curr);
            }
        }
        // System.out.println(intersection);
        int[] points = new int[intersection.size()];
        int i = 0;
        for(int val : intersection){
            points[i] = val;
            i++;
        }
        return points;
    }

    private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
 
