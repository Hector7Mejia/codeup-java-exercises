package study_hall.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class gradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        int compare = 0;
        int sub = 0;
        List<Integer> bat = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {
            compare = (grades.get(i) / 5) +1;
            sub = 5 * compare;

            if(grades.get(i) < 40) {
                bat.add(grades.get(i));
                continue;
            }else if( sub - grades.get(i) >= 3) {
                bat.add(grades.get(i));
                continue;
            }
            else if(grades.get(i) % 5 != 0 ) {
                bat.add(sub);
            }
        }

        return bat;
    }

    public static void main(String[] args) {
        List<Integer> ban = new ArrayList<Integer>();
        ban.add(38);
        ban.add(84);
        ban.add(29);
//        System.out.println(84 / 5);
        int answer = 84/5;
        int compare = answer + 1;
//        System.out.println( (compare * 5) - 82);
//        System.out.println(answer);


        System.out.println(gradingStudents(ban));
    }
}
