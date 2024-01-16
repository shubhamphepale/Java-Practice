package StringPrograms;

public class MyString {
    public static void main(String[] args) {
        String str = "Shubham";
        CustomeString customeString = new CustomeString(str);
        int i = customeString.length();
        System.out.println(i);
        System.out.println("Hi" + 1 + 1);
        //
        System.out.println("Hi" + 2 * 2);
        //
        System.out.println(1 + 1 + "Hi" + 1 + 1+1);
        //
    }
}
