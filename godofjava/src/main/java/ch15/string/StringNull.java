package ch15.string;

public class StringNull {
    public static void main(String[] args) {
        StringNull sample = new StringNull();
        sample.nullCheck2(null);
    }

    public boolean nullCheck2(String text) {
        if (text == null) {
            return true;
        } else {
            int textLength = text.length();
            System.out.println(textLength);
            return false;
        }
    }
}
