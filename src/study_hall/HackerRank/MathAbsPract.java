package study_hall.HackerRank;

public class MathAbsPract {

    static String catAndMouse(int x, int y, int z) {
        String answer = "";

        if(Math.abs(x - z) == Math.abs(y - z)) {
            answer = "Mouse C";
        } else if(Math.abs(x - z) > Math.abs(y - z)) {
            answer = "Cat B";
        } else if(Math.abs(x - z) < Math.abs(y - z)) {
            answer = "Cat A";
        }
        return answer;

    }
}
