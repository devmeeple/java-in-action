package mid2.collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제8: 간단한 히스토리 확인
 * 1) 스택에 push()를 통해 데이터를 입력
 * - "youtube.com"
 * - "google.com"
 * - "facebook.com"
 * 2) 스택에 pop()을 통해 데이터를 꺼내고, 꺼낸 순서대로 출력
 * - "facebook.com"
 * - "google.com"
 * - "youtube.com"
 */
public class SimpleHistoryTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
