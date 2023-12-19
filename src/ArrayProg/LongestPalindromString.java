package ArrayProg;

import java.util.Scanner;

public class LongestPalindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        String finalResult = checkLongestPalindrom(str);
        System.out.println("Final Result : "+finalResult);
    }

    private static String checkLongestPalindrom(String str) {

        String finalString = null;
        int start = 0, end = 1;
        int low = 0, high = 0;
        for (int i = 1; i < str.length(); i++) {
            low = i - 1;
            high = i;

            while (high < str.length() && low >= 0 && (str.charAt(low) == str.charAt(high))) {
                if (high - low + 1 > end) {
                    start = low;
                    end = high - low + 1;
                }
                low--;
                high++;
            }

            low = i - 1;
            high = i + 1;

            while (high < str.length() && low >= 0 && (str.charAt(low) == str.charAt(high))) {
                if (high - low + 1 > end) {
                    start = low;
                    end = high - low + 1;
                }
                low--;
                high++;
            }
            finalString = str.substring(start, start + end);
        }
        return finalString;
    }
}
