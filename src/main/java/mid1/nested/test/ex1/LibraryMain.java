package mid1.nested.test.ex1;

/**
 * 문제5: 도서 관리 시스템
 * 1) 여러 권의 도서 정보를 관리하는 도서 관리 시스템 만들기
 * - 도서 제목(title)
 * - 저자명(author)
 * - 도서 추가, 모든 도서 정보 출력
 * 2) Book 클래스는 Library 내부에서만 사용한다.
 */
public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(4);

        library.addBook("책1", "저자1");
        library.addBook("책2", "저자2");
        library.addBook("책3", "저자3");
        library.addBook("자바 ORM 표준 JPA 프로그래밍", "김영한");
        library.addBook("OneMoreThing", "잡스");
        library.showBooks();
    }
}
