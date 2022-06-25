package study_hall;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class timeConversion {
    private static final DateFormat TWELVE_TF = new SimpleDateFormat("hh:mm:ssa");
    private static final DateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm:ss");

    public static String timeConversionString(String s) {
        try {
            return TWENTY_FOUR_TF.format(
                    TWELVE_TF.parse(s));
        } catch (ParseException e) {
            return s;
        }
    }

    public static String conversion(String s) {
        try {
            return TWENTY_FOUR_TF.format(TWELVE_TF.parse(s));
        } catch (ParseException e) {
            return s;
        }
    }
    public static void main(String[] args) {

        System.out.println(conversion("07:05:45PM"));
    }
}


