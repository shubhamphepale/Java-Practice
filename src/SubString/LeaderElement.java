package SubString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeaderElement {
    public static void main(String[] args) {
        List<Integer> element = new ArrayList<>(Arrays.asList(16,17,4,3,5,2));
        List<Integer> leaderElementList = new ArrayList<>();
        Integer maxEle = element.stream().max(Integer::compareTo).get();
        leaderElementList.add(maxEle);
        for(Integer e : element){
            if(e == maxEle){
                element.remove(e);
            }
        }
        System.out.println("Leader Element : "+leaderElementList);
    }
}
