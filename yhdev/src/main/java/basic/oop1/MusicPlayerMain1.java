package basic.oop1;

/**
 * 문제: 음악 플레이어 만들기(절차 지향)
 * 1) 전원 키기, 끄기
 * 2) 감소, 증가
 * 3) 상태를 확인
 */
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);

        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);

        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);

        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}