package ArrayProg;

public class ArrayInversionCount {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};
        //int[] arr =  {10, 10, 10};
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.print("("+arr[i]+","+arr[j]+")");
                    counter++;
                }
            }
        }
        System.out.println("\nInversion Count : "+counter);
    }
}
