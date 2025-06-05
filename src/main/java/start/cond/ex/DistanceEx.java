package start.cond.ex;

/**
 * 문제2: 거리에 따른 운송 수단 선택하기
 * 1) 주어진 거리에 따라 적합한 운송 수단 출력
 * - 도보: 거리 1km 이하
 * - 자전거: 거리 10km 이하
 * - 자동차: 거리 100km 이하
 * - 비행기: 거리 100km 초과
 */
public class DistanceEx {
    public static void main(String[] args) {
        int distance = 25;

        if (distance <= 1) {
            System.out.println("도보를 이용하세요.");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요.");
        } else if (distance <= 100) {
            System.out.println("자동차를 이용하세요.");
        } else {
            System.out.println("비행기를 이용하세요.");
        }
    }
}
