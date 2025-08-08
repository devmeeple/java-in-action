package basic.extends1.ex;

/**
 * 문제: 상속 관계 상품
 * 1) 쇼핑물의 판매 상품(책, 앨범, 영화) 선언
 *  - 부모 클래스 Item을 사용하여 상속 관계를 표현
 *  - 공통 속성: 이름, 가격
 *  - 공통 기능: 출력
 * 2) 책: 저자, isbn
 * 3) 앨범: 아티스트
 * 4) 영화: 감독, 배우
 */
public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000, "seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
