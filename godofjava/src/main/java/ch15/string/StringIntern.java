package ch15.string;

public class StringIntern {
    public static void main(String[] args) {
        StringIntern sample = new StringIntern();
        sample.internCheck();
    }

    public void internCheck() {
        String text1 = "Java Basic";
        String text2 = "Java Basic";

        String text3 = new String("Java Basic");
        text3 = text3.intern();

        System.out.println(text1 == text2);
        System.out.println(text1 == text3);
        System.out.println(text1.equals(text3));
    }
}
