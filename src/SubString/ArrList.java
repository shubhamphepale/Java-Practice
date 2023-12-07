package SubString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArrList {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Alice");
        employees.add("Bob");

        Collections.sort(employees);

        Stream<String> sorted = employees.stream().sorted();
        System.out.println(sorted);

    }
}
