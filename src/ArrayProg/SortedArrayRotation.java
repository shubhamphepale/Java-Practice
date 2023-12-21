package ArrayProg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedArrayRotation {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(4, 5, 6, 7, 0, 1, 2);
        List<Integer> list = Arrays.asList(3,4,5,1,2);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        int rotationcount = getRotationCount(list,sortedList);
        System.out.println("Output : "+sortedList.getFirst()+" and the origanl array is "+sortedList+" and Rotation : "+rotationcount);
    }

    private static int getRotationCount(List<Integer> list, List<Integer> sortedList) {
        for (int i = 0;i<list.size();i++){
            if(list.get(i).equals(sortedList.getFirst())){
                return i;
            }
        }
        return 0;
    }
}
