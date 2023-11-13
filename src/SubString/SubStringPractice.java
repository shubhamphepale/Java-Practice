package SubString;

import java.util.Scanner;

public class SubStringPractice {
    public static void main(String[] args) {
        //inputs: x = abcd and y = xycd output = 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String X : ");
        String x = sc.next();
        System.out.println("Enter String Y : ");
        String y = sc.next();
        subSequencesString(x,y);
    }

    private static void subSequencesString(String x, String y) {

        StringBuilder subStr = new StringBuilder();
        for(int i=0;i<x.length();i++){
            if(subStr.indexOf(String.valueOf(x.charAt(i))) == -1){
                subStr.append(x.charAt(i));
            }
        }
        for(int i=0;i<y.length();i++){
            if(subStr.indexOf(String.valueOf(y.charAt(i))) == -1){
                subStr.append(y.charAt(i));
            }
        }
        System.out.println("subsequences length = "+ subStr.length());
    }
}
