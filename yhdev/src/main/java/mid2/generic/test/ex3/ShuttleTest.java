package mid2.generic.test.ex3;

import mid2.generic.test.ex3.unit.Marine;
import mid2.generic.test.ex3.unit.Zealot;
import mid2.generic.test.ex3.unit.Zergling;

/**
 * 문제2: 제네릭 타입과 상한
 * 1) Shuttle 클래스 선언
 * - showInfo(): 탑승한 유닛의 정보 출력
 * - 제네릭 타입 사용
 */
public class ShuttleTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));
        shuttle1.showInfo();

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));
        shuttle2.showInfo();

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿", 100));
        shuttle3.showInfo();
    }
}
