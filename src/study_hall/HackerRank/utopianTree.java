package study_hall.HackerRank;

public class utopianTree {

    public static int utopia(int n) {
        int answer = 1;

        for(int i=0; i <= n; i++) {
            if(n < 1) {
                return answer;
            } else if(2 % i == 0) {
                answer ++;
            } else {
                answer *= 2;
            }
        }
        return answer;
    }
}
