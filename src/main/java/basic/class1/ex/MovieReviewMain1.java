package basic.class1.ex;

/**
 * 문제: 영화 리뷰 관리하기1 - 변수
 * 1) 영화 리뷰 정보를 담는 MovieReview 클래스 선언
 *  - 영화 제목
 *  - 리뷰 내용
*  2) 영화 리뷰 정보를 선언하고 출력
 */
public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        System.out.println("영화 제목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
    }
}
