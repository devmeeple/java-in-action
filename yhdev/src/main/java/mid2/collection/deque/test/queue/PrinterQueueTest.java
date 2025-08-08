package mid2.collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 문제10: 프린터 대기
 * 1) "doc1", "doc2", "doc3" 문서를 순서대로 입력하고, 입력된 순서대로 출력
 */
public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();

        printQueue.add("doc1");
        printQueue.add("doc2");
        printQueue.add("doc3");

        System.out.println("출력: " + printQueue.poll());
        System.out.println("출력: " + printQueue.poll());
        System.out.println("출력: " + printQueue.poll());
    }
}
