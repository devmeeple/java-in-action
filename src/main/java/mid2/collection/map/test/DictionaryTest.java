package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * // TODO: 2025-06-04 메서드로 분리하여 테스트 코드로 검증
 * 문제5: 영어 사전 만들기
 * 1) 영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전
 * 2) 영어 단어와 한글 단어를 사전에 저장
 * 3) 단어를 검색
 */
public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String englishWord = scanner.nextLine();

            if (englishWord.equals("q")) {
                break;
            }

            System.out.print("한글 뜻을 입력하세요: ");
            String koreanMeaning = scanner.nextLine();

            dictionary.put(englishWord, koreanMeaning);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String searchWord = scanner.nextLine();

            if (searchWord.equals("q")) {
                break;
            }

            if (dictionary.containsKey(searchWord)) {
                String koreanMeaning = dictionary.get(searchWord);
                System.out.println(searchWord + "의 뜻: " + koreanMeaning);
            } else {
                System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
