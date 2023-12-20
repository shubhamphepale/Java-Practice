package ArrayProg;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class LargestProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 3, -2, 4};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int temp=arr[i]*arr[i+1];
            list.add(temp);
        }
        Integer product = list.stream().max(Integer::compareTo).orElse(null);
        System.out.println("Lagrest Product : " + product);
    }
}
