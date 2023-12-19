package StringPrograms;


import java.util.Scanner;

/*You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.
The test cases are generated so that a unique mapping will always exist.
Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
*/
public class UniqueMapping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        checkUniqueMapping(str);
    }

    private static void checkUniqueMapping(String str) {
        int i =0;
        StringBuilder stringBuilder = new StringBuilder();
        for (i=0;i<str.length();i++){
            char intToCh = 0;
            if (i + 2 < str.length() && str.charAt(i + 2) == '#') {
                String substring = str.substring(i, i + 2);
                int temp = Integer.parseInt(substring);
                intToCh = (char) (temp + 96);
                stringBuilder.append(intToCh);
                i += 2;
            } else {
                char ch = str.charAt(i);
                stringBuilder.append((char) (ch+48));
            }
        }
        System.out.println("Unique String : "+stringBuilder);
    }
}
