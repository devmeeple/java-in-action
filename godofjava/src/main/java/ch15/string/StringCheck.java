package ch15.string;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();
        sample.checkMatch();
    }

    public void checkMatch() {
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";

        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(5, compare1, 0, 2));
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
    }
}
