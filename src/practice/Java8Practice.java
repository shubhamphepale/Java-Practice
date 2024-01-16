package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Practice {
    public static void main(String[] args) {
        int arr[] = {10, 15, 25, 35, 7, 9, 1, 0, 77};
        ArrayList<Integer> collect = Arrays.stream(arr).mapToObj(a -> a).collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println(collect);
        ArrayList<Integer> collect1 = collect.stream().filter(e -> e.toString().startsWith("3")).collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println(collect1);
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println(list);
//        int count = 0;
//        for(int i = 0;i<5;i++){
//            if(i%2==0)continue;
//            count++;
//        }
//        System.out.println(count);
//        Stream.of(1, 1, 2, 3, 4, 5).peek(System.out::println).count();
//        List<Integer> list = Arrays.asList(23,22,34,25,84);
//        List<Integer> collect = list.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
//        Integer integer = collect.stream().skip(1).findFirst().orElse(null);
//        System.out.println(integer);
    }
}

