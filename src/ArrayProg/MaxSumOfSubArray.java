package ArrayProg;

import java.util.Scanner;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter Array element :");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K : ");
        int k = sc.nextInt();
        System.out.println("The Maximum Sum of Sub Array is : " + findMaxsumOfSubArray(arr, k));
    }

    private static int findMaxsumOfSubArray(int[] arr, int k) {
        int sumOfKArr = 0;
        int tempSum = 0;
        //for 1st sub array
        for (int i = 0; i < k; i++) {
            sumOfKArr += arr[i];
        }
        tempSum = sumOfKArr;
        //kth sub array
        for (int i = k; i < arr.length; i++) {
            sumOfKArr += arr[i] - arr[i-k];
            if (sumOfKArr > tempSum) {
                tempSum = sumOfKArr;
            }
        }
        return tempSum;
    }
}
