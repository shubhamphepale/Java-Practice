package ArrayProg;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter array positive number in array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sumOfArray = Arrays.stream(arr).sum();
        System.out.println("Final Output : " + checkPrimeNumber(sumOfArray));

    }

    private static int checkPrimeNumber(int sumOfArray) {
        int intialSum = sumOfArray;
        boolean isPrime = false;
        for (int i = 2; i <= sumOfArray / 2; i++) {
            if (sumOfArray % i == 0) {
                sumOfArray++;
                i = 2;
            } else {
                isPrime = true;
            }
        }
        if (isPrime) {
            int finalOutput = sumOfArray - intialSum;
            return finalOutput;
        }
        return 0;
    }
}
