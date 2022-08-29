package study_hall.HackerRank;

import java.util.ArrayList;

public class Stringss {
    public int solve(String[] words) {
        ArrayList<String> set = new ArrayList<>();
        for (String word : words) {
            boolean exist = false;
            for (String rotation : set) {
                if (rotation.length() == word.length() * 2 && rotation.contains(word)) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                set.add(word + word);
            }
        }
        return set.size();
    }
}
