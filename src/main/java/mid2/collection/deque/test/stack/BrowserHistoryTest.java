package mid2.collection.deque.test.stack;

/**
 * // TODO: 2025-06-04
 * 문제9: 브라우저 히스토리 관리
 * 1) BrowserHistory 선언
 * - visitPage(): 특정 페이지 방문
 * - goBack(): 뒤로가기
 */
public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visitPage("youtube.com");
        browser.visitPage("google.com");
        browser.visitPage("facebook.com");

        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1);

        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);
    }
}
