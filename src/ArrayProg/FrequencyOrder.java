package ArrayProg;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list =Arrays.asList(1,1,1,2,2,3);
        System.out.println("Enter frequency k : ");
        int k = sc.nextInt();
        getFrequntData(list, k);
    }

    private static void getFrequntData(List<Integer> list, int k) {
        // here i count repeted element
        Map<Integer, Long> frequencyMap = list.stream().collect(Collectors.groupingBy(ele -> ele, Collectors.counting()));
        List<Integer> result = new ArrayList<>();
        //here i filter with k frequency
        for (Map.Entry<Integer,Long> entry : frequencyMap.entrySet()){
            if (entry.getValue()>=k){
                result.add(entry.getKey());
            }
        }
        System.out.println("Final Result : "+result);
    }
}
