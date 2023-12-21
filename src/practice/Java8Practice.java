package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Practice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,22,34,25,84);
        List<Integer> collect = list.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
        Integer integer = collect.stream().skip(1).findFirst().orElse(null);
        System.out.println(integer);
    }
}
