public class ReversString {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String[] str = s.split("\\.");
        int strLenght = str.length;
        String[] tempStr = new String[strLenght];
        for (int i = 0; i < strLenght; i++) {
            tempStr[i] = str[strLenght - 1 - i];
        }
        String finalString = String.join(".", tempStr);
        System.out.println("Final output : " + finalString);
    }
}
