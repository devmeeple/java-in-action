package mid2.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * // TODO: 2025-06-03 출력조건 다시 확인 필요
 * 문제2: 리스트의 입력과 출력
 * 1) n개의 정수를 입력받아 List에 저장, 입력 순서대로 출력
 * - 0을 입력하면 입력을 종료하고 결과를 출력
 * - 출력: 쉼표를 사용하여 구분하고 마지막은 쉼표를 넣지 않음
 */
public class ListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("출력");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
