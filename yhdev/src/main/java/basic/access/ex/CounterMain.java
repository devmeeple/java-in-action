package basic.access.ex;

/**
 * 문제: 최대 카운터와 캡슐화
 * 1) 최댓값을 지정하고 최댓값까지만 값이 증가
 * 2) 멤버
 * - count: 내부에서 사용, 초기값 0
 * - max: 최댓값, 생성자 입력
 * - increment(): 숫자 증가
 * - getCount(): 증가한 값 반환
 */
public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);

        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        int count = counter.getCount();
        System.out.println(count);
    }
}
