package mid1.enumeration.test.http;

import java.util.Scanner;

/**
 * // TODO: 2025-05-28 테스트 코드 추가
 * 문제4: HttpStatus 상태 코드 정의
 * 1) HttpStatus 열거형 선언
 * - OK(200, "OK")
 * - BAD_REQUEST(400, "Bad Request")
 * - NOT_FOUND(404, "Not Found")
 * - INTERNAL_SERVER_ERROR(500, "Internal Server Error")
 * 2) HTTP 상태 코드는 200 ~ 299 사이의 숫자를 성공으로 인정
 */
public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        if (status == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }
}
