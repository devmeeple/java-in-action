package basic.static2.ex;

/**
 * // TODO: 2025-05-14 테스트 코드 추가
 * 문제2: 수학 유틸리티 클래스
 * 1) MathArrayUtils 클래스 선언
 *  - 인스턴스를 생성하지 못하게 막음
 *  - 객체를 생성하지 않고 기능을 사용할 수 있어야 함
 *  - sum(int[] array): 배열의 합계 반환
 *  - average(int[] array): 배열의 평균 반환
 *  - min(int[] array): 배열의 최소값 반환
 *  - max(int[] array): 배열의 최댓값 반환
 */
public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("sum=" + MathArrayUtils.sum(values));
        System.out.println("average=" + MathArrayUtils.average(values));
        System.out.println("min=" + MathArrayUtils.min(values));
        System.out.println("max=" + MathArrayUtils.max(values));
    }
}
