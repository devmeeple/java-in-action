package start.cond.ex;

/**
 * 문제4: 평점에 따른 영화 추천하기
 * 1) 요청한 평점(double rating) 이상의 영화를 찾아 추천하는 프로그램
 * - 평점9: 어바웃타임
 * - 평점8: 토이 스토리
 * - 평점7: 고질라
 * - if문 사용하기
 */
public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 7.1;

        if (rating <= 9) {
            System.out.println("'어바웃 타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
