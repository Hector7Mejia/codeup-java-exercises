package study_hall.HackerRank;

public class XOR {
    public static void main(String[] args) {
        int[] arr = {1, 2,2, 3,3, 4,4};
        lonelyNumber(arr);
    }

    public static int lonelyNumber(int[] intArray) {
        int answer = 0;
        for(int i=0;i < intArray.length;i++) {
            answer ^= intArray[i];
        }
        System.out.println(answer);
        return answer;
    }
}
