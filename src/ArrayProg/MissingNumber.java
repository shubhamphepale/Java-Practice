package ArrayProg;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length+1;
        int sum = 0;
        sum = n * (n + 1) / 2;
        System.out.println(sum);
        for (int i : arr) {
            sum = sum - i;
        }
        System.out.println(sum);
    }
}
