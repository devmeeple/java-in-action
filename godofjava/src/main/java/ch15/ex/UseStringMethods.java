package ch15.ex;

public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods sample = new UseStringMethods();

        String str = "The String class represents character strings.";
        String findStr = "string";

        sample.printWords(str);
        sample.findString(str, findStr);
        sample.findAnyCaseString(str, findStr);
        sample.countChar(str, 's');
        sample.printContainWords(str, "ss");
    }

    public void printWords(String str) {
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public void findString(String str, String findStr) {
        int result = str.indexOf(findStr);
        if (result != -1) {
            System.out.println(findStr + " is appeared at " + result);
        }
    }

    public void findAnyCaseString(String str, String findStr) {
        String lowerStr = str.toLowerCase();
        String lowerFindStr = findStr.toLowerCase();

        int result = lowerStr.indexOf(lowerFindStr);
        if (result != -1) {
            System.out.println(findStr + " is appeared at " + result);
        }
    }

    public void countChar(String str, char c) {
        char[] strArray = str.toCharArray();
        int charCount = 0;
        for (char letter : strArray) {
            if (letter == c) {
                charCount++;
            }
        }
        System.out.println("char '" + c + "' charCount is " + charCount);
    }

    public void printContainWords(String str, String findStr) {
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.contains(findStr)) {
                System.out.println(word + " contains " + findStr);
            }
        }

    }
}
