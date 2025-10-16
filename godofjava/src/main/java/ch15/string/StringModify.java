package ch15.string;

public class StringModify {
    public static void main(String[] args) {
        StringModify sample = new StringModify();
        sample.checkTrim();
    }

    public void checkTrim() {
        String[] strings = {
                " a", " b ", "    c", "d    ", "e   f", "   "
        };

        for (String string : strings) {
            System.out.println("[" + string + "] ");
            System.out.println("[" + string.trim() + "] ");
        }
    }
}
