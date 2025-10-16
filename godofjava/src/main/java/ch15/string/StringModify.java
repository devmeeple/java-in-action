package ch15.string;

public class StringModify {
    public static void main(String[] args) {
        StringModify sample = new StringModify();
        sample.checkReplace();
    }
    
    public void checkReplace() {
        String text = "The String class represents character strings.";

        System.out.println(text.replace('s', 'z'));
        System.out.println(text);
        System.out.println(text.replace("tring", "trike"));
        System.out.println(text.replaceAll(" ", "|"));
        System.out.println(text.replaceFirst(" ", "|"));
    }
}
