package study_hall.HackerRank;

public class changeCalc {
    public static void smallestChange(int bill) {
        int[] changeArr = {20, 10, 5, 1};
        String[] change = {"twenties", "tens", "fives", "ones"};
        int index = 0;


        while (bill > 0) {
            for (int i = 0; i < changeArr.length; i++) {
                int counter = 0;
                if(bill >= changeArr[i]) {
                    counter = bill / changeArr[i];
                    bill = bill - (counter * changeArr[i]);
                }
                System.out.println( "your change in " + change[i] + " is " + counter );
            }
        }
    }


    public static void main(String[] args) {
        smallestChange(12);
//        System.out.println(10 % 12);
    }

}
