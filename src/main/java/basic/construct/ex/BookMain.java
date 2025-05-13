package basic.construct.ex;

/**
 * // TODO: 2025-05-13 생성자 this 활용
 * 문제: Book과 생성자
 * 1) Book 클래스의 생성자 코드에 중복 제거
 */
public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();

        Book book3 = new Book("JPA 프로그래밍", "kim", 700);
        book3.displayInfo();
    }
}
