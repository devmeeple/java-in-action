package mid2.generic.test.ex3;

import mid2.generic.test.ex3.unit.Marine;
import mid2.generic.test.ex3.unit.Zealot;

/**
 * 문제1: 제네릭 메서드와 상한
 * 1) UnitUtil 클래스 선언
 * - UnitUtil.maxHp(): 두 유닛 중 체력이 높은 유닛을 반환, 체력이 같은 경우 둘 중 아무거나 반환
 * - 제네릭 메서드 사용
 * - 입력하는 유닛의 타입과 반환하는 유닛의 타입이 같아야 함
 */
public class UnitUtilTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린2", 50);
        Marine resultMarine = UnitUtil.maxHp(m1, m2);
        System.out.println("resultMarine = " + resultMarine);

        Zealot z1 = new Zealot("질럿1", 100);
        Zealot z2 = new Zealot("질럿2", 150);
        Zealot resultZealot = UnitUtil.maxHp(z1, z2);
        System.out.println("resultZealot = " + resultZealot);
    }
}
