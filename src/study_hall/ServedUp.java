package study_hall;

public class ServedUp {
    public static void main(String [] args) {

        int[] firstToServe  = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[] takeOutList  = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[] dineInList  = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        isFirstComeFirstServed(firstToServe,takeOutList,dineInList);
    }

    public static boolean isFirstComeFirstServed(int[] firstToService, int[] takeOut, int[] dineIn) {
        int takeOutIndex = 0;
        int dineInIndex = 0;

        for (int order: firstToService) {

            if(firstToService.length > takeOutIndex && order == takeOut[takeOutIndex]) {

                takeOutIndex ++;
            }

            else if(firstToService.length > dineInIndex && order == dineIn[dineInIndex]) {

                dineInIndex ++;
            }
            else {
                return false;
            }

        }

        if(dineInIndex != dineIn.length || takeOutIndex != takeOut.length) {
            return false;

        }

    return true;
    }
}
