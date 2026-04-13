package DSA.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActivitySelectionProblem {

    // end time to ascending order me sort kar do
    // 13 25 68 39 810

    static class Pair{
        int start;

        @Override
        public String toString() {
            return "Pair{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static int activitySelection(int [][] activities) {
        List<Pair> list = new ArrayList<>();

        for(int[] activity : activities) {
            Pair pair = new Pair(activity[0], activity[1]);
            list.add(pair);
        }

        Collections.sort(list,
                (a,b) -> a.end - b.end);

        int temp = -1;
        int count = 0;

        for(Pair pair : list) {

            if(pair.start >= temp) {
                System.out.println(pair);
                temp = pair.end;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int activities [][] = {{1,3}, {2,5}, {3,9}, {6,8}, {8,10}
        };

        System.out.println(activitySelection(activities));
    }
}
