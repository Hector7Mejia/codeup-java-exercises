package study_hall.HackerRank;

public class checkIfIsHacker {
private static String checkIfHacker(String s) {

    String str = "hackerrank";
    if (s.length() < str.length()) {
        return "NO";
    }
    int j = 0;
    for (int i = 0; i < s.length(); i++) {
        if (j < str.length() && s.charAt(i) == str.charAt(j)) {
            j++;
        }
    }
    return (j == str.length() ? "YES" : "NO");
}
        }
