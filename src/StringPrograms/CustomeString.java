package StringPrograms;

public class CustomeString{
    private char[] str;

    // Constructors
    public CustomeString() {
        this.str = new char[0];
    }

    public CustomeString(String str) {
        this.str = str.toCharArray();
    }

    public int length(){
        return str.length;
    }
}

