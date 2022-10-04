package study_hall.HackerRank;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class betweenTwo {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        Collections.sort(a);
        Collections.sort(b);
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=a.get(a.size()-1);i<=b.get(0);i++){
            set.add(i);
            for(int j=0;j<a.size();j++){
                if(i%a.get(j)!=0){
                    set.remove(i);
                }
            }
            for(int j=0;j<b.size();j++){
                if(b.get(j)%i!=0 && set.contains(i)){
                    set.remove(i);
                }
            }

        }
        System.out.println(set);
        return set.size();
    }
}
