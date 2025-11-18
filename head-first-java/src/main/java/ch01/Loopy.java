package ch01;

public class Loopy {

    public static void main(String[] args) {
        int x = 1;
        System.out.println("반복문 이전");

        while (x < 4) {
            System.out.println("반복문 내부");
            System.out.println("x의 값은 " + x + "입니다.");
            x = x + 1;
        }
        System.out.println("여기는 반복문 이후입니다.");
    }
}
