package study_hall.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class climbingLeaderboard {
    List<Integer> results = new ArrayList<>();
    int playerCounter = 0;
    int rankCounter = 0;
    ranked = ranked
            .stream()
            .distinct()
.sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());

while((playerCounter < player.size()) && (rankCounter < ranked.size()) ){
        if(player.get(playerCounter).compareTo(ranked.get(rankCounter))<0){
            results.add(ranked.size()-rankCounter+1);
            playerCounter++;
        }
        else{
            if(rankCounter == ranked.size()-1){
                results.add(1);
                playerCounter++;
            }else{
                rankCounter++;
            }
        }
    }
return results;
}
