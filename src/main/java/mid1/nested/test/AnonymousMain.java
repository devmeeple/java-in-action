package mid1.nested.test;

/**
 * 문제4: 익명 클래스를 완성해라
 * 1) 익명 클래스 Hello hello() 메서드 호출
 */
class AnonymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };
        hello.hello();
    }
}
