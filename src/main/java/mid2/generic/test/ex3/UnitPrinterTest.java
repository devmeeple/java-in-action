package mid2.generic.test.ex3;

import mid2.generic.test.ex3.unit.Marine;
import mid2.generic.test.ex3.unit.Zealot;
import mid2.generic.test.ex3.unit.Zergling;

/**
 * 문제3: 제네릭 메서드와 와일드카드
 * 1) UnitPrinter 클래스 선언
 * - 유닛의 정보를 출력하는 메서드 정의
 * - UnitPrinter.printV1(): 제네릭 메서드
 * - UnitPrinter.printV2(): 와일드카드 사용
 * - Shuttle 활용
 */
public class UnitPrinterTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿", 100));

        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle1);
    }
}
