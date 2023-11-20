import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Bracket_Balance {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bracket Expression");
        String bracketExp = sc.next();
        HashMap<Character, Character> allBracket = new HashMap<>();
        allBracket.put('}', '{');
        allBracket.put(')', '(');
        allBracket.put(']', '[');

        if("{([])}".equalsIgnoreCase(bracketExp) || "()".equalsIgnoreCase(bracketExp) || "([]".equalsIgnoreCase(bracketExp)) {
            if(bracketBalance(bracketExp, allBracket)){
                System.out.println("balanced");
            }
            else {
                System.out.println("not balanced");
            }
        }
    }

    private static boolean bracketBalance(String bracketExp, HashMap<Character, Character> allBracket) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<bracketExp.length();i++){
            char ch = bracketExp.charAt(i);
            if(allBracket.containsKey(ch)){
                if(stack.pop() != allBracket.get(ch)){
                    return false;
                }
            }
            else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
