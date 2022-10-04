package study_hall.HackerRank;

import java.util.List;

public class miniRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        //Write your code here
        int min = scores.get(0);
        int max = scores.get(0);

        int timesBrokeMin = 0;
        int timesBrokeMax = 0;
        for(int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);
            if(score > max) {
                max = score;
                timesBrokeMax++;
            } else if(score < min) {
                min = score;
                timesBrokeMin++;
            }
        }

        return List.of(timesBrokeMax, timesBrokeMin);
    }
}
