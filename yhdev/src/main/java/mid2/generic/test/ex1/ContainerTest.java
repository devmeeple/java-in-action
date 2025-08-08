package mid2.generic.test.ex1;

/**
 * 문제1: 제네릭 기본1
 * 1) 실행 결과를 참고하여 Container 클래스 선언
 * - Container 클래스는 제네릭을 사용해야 함
 */
public class ContainerTest {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println("빈값 확인1: " + stringContainer.isEmpty());

        stringContainer.setItem("data1");
        System.out.println("저장 데이터: " + stringContainer.getItem());
        System.out.println("빈값 확인2: " + stringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        System.out.println("저장 데이터: " + integerContainer.getItem());
    }
}
