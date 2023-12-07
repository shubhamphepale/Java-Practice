package SubString;

import java.util.Scanner;

public class UserInputStringReversal {
    public static void main(String[] args) {
        String str = "shubham";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    private static String reverseString(String str) {
        if(str.isEmpty() || str.length() == 1){
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
