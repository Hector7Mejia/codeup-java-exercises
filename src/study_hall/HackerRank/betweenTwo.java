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
    public static int getTotal(List<Integer> a, List<Integer> b) {
        // Write your code here
        int outputCounter = 0;
        Collections.sort(a); Collections.sort(b);
        int min = a.get(0); int max = b.get(b.size()-1);

        int selectedNumber = min;

        boolean firstArrayCheck = false;
        boolean secondArrayCheck = false;
        for (int i = min; i <= max ; i+=1) {

            for (int j = 0; j < a.size(); j++ ) {
                if ( selectedNumber % a.get(j)  == 0 ) {
                    // do nothing
                    firstArrayCheck = true;
                } else {
                    firstArrayCheck = false; break;
                }
            }

            if (firstArrayCheck) {
                for (int j = 0; j < b.size(); j++ ) {
                    if ( b.get(j) % selectedNumber == 0 ) {
                        // do nothing
                        secondArrayCheck = true;
                    } else {
                        secondArrayCheck = false; break;
                    }
                }
            }

            if (firstArrayCheck && secondArrayCheck) outputCounter++;

            // Resetting ArrayChecks
            firstArrayCheck = false; secondArrayCheck = false;

            selectedNumber += 1;
        }

        return outputCounter;

    }
}
