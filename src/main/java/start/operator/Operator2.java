package start.operator;

public class Operator2 {

    public static void main(String[] args) {

        String result1 = "hello" + "world";
        System.out.println("result1 = " + result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println("result2 = " + result2);

        String s3 = "a + b" + 10;
        System.out.println("s3 = " + s3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println("result4 = " + result4);
    }
}
