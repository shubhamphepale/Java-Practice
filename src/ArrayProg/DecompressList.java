package ArrayProg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecompressList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter Array element :");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        splitArray(arr);
    }

    static void splitArray(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i += 2) {
            int freq = arr[i];
            int nextArrValue = arr[i + 1];

            for (int j = 0; j < freq; j++) {
                list.add(nextArrValue);
            }
        }

        int finalArray[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            finalArray[i] = list.get(i);
        }
        System.out.print("[");
        for (int ele : finalArray) {
            System.out.print(ele + ",");
        }
        System.out.print("]");
    }
}
