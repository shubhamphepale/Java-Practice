package StringPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceCharStr {
    public static void main(String[] args) {
        String str = "Shubham";
        Map<Character,Long> occurenceCount = str.chars()
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        occurenceCount.forEach((character, count) -> System.out.println(character + " : "+count));
    }
}
