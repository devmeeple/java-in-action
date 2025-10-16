package ch15.string;

public class StringSplit {
    public static void main(String[] args) {
        StringSplit sample = new StringSplit();
        sample.checkSplit();
    }

    public void checkSplit() {
        String text = "Java technology is both a programming language and a platform";
        String[] splitArray = text.split(" ");

        for (String temp : splitArray) {
            System.out.println(temp);
        }
    }
}
