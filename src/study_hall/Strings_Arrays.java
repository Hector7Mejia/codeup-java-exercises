package study_hall;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Strings_Arrays {
    public static void main(String[] args) {
        ArrayList<String> testString = new ArrayList<>();
        testString.add("sunny");
        testString.add("places");
        testString.add("are");
        testString.add("the");
        testString.add("best");
        System.out.println(stringArrayCombiner(testString));
        drawRectangle(20,3);

//        drawRectangle(4, 3) will draw
//****
//*  *
//****
    }

    public static String stringArrayCombiner(ArrayList<String> arrayToCombine) {
        String word ="";
        for (int i = 0; i < arrayToCombine.size(); i++) {
             word += arrayToCombine.get(i) + " ";

        }
        return word;
    }

    public static void drawRectangle(int width,int height){
        //draw the top
        for (int i = 0; i < width; i++) {
            System.out.printf("*");
        }


    }
}
