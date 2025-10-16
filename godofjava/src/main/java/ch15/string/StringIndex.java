package ch15.string;

public class StringIndex {
    public static void main(String[] args) {
        StringIndex sample = new StringIndex();

        sample.checkIndexOf();
        System.out.println("=================");
        sample.checkLastIndexOf();
    }

    public void checkIndexOf() {
        String text = "Java technology is both a programming language and a platform";

        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a', 20));
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf('z'));
    }

    public void checkLastIndexOf() {
        String text = "Java technology is both a programming language and a platform";

        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a', 20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z'));
    }
}
