package romToInt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman character to convert into Integer : ");
        String roman = sc.next();
        int finalConversion = romToIngConversion(roman);
        System.out.println("Converted From Roman To Integer :"+finalConversion);
    }
    public static int romToIngConversion(String rom){
        int finalOutput=0;
        Map<Character,Integer> romanAndIntegerMap = new HashMap<>();
        romanAndIntegerMap.put('I',1);
        romanAndIntegerMap.put('V',5);
        romanAndIntegerMap.put('X',10);
        romanAndIntegerMap.put('L',50);
        romanAndIntegerMap.put('C',100);
        romanAndIntegerMap.put('D',500);
        romanAndIntegerMap.put('M',1000);

        for(int i = 0; i<rom.length()-1;i++){
            if(romanAndIntegerMap.get(rom.charAt(i)) >= romanAndIntegerMap.get(rom.charAt(i+1))){
                finalOutput += romanAndIntegerMap.get(rom.charAt(i));
            }
            else {
                finalOutput -= romanAndIntegerMap.get(rom.charAt(i));
            }
        }
        finalOutput += romanAndIntegerMap.get(rom.charAt(rom.length() - 1));
        return finalOutput;
    }
}