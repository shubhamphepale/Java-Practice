package StringPrograms;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check string is palindrome or not");
        String str = sc.next();
        checkPalindrome(str);
    }

    private static void checkPalindrome(String str) {
        String temp = str.toLowerCase();
        String regStr = temp.replaceAll("\\s","");
        String finalStr = regStr.replaceAll("[^a-zA-Z0-9]","");
        StringBuffer sb = new StringBuffer(finalStr);
        if(temp.equals(String.valueOf(sb.reverse()))){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
