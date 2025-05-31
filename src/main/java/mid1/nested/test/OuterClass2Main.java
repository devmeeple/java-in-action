package mid1.nested.test;

/**
 * 문제2: 내부 클래스를 완성해라
 * 1) InnerClass hello() 메서드 호출
 */
public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
    }
}
