package SubString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sortingCollection {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        String[] dotSeparateStr = str.split("\\.");
        List<String> list = new ArrayList<>(Arrays.asList(dotSeparateStr));
        Collections.reverse(list);
        String join = String.join(".", list);
        System.out.println("Final list is : "+join);
    }
}
