package ch15.string;

public class StringSubstring {
    public static void main(String[] args) {
        StringSubstring sample = new StringSubstring();
        sample.checkSubstring();
    }

    public void checkSubstring() {
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println(technology);

        String tech = text.substring(5, 9);
        System.out.println(tech);
    }
}
