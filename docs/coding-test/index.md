# CodeUp 기초 100제

## 비트시프트연산

### 1047. 정수 1개 입력받아 2배 곱해 출력하기(설명)

```java
public class P1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result = number << 1;

        System.out.println(result);

        scanner.close();
    }
}
```

- `-1073741824 ~ +1073741823` 범위에 적합한 자료형은 `int`형이다.
- `number << 1`은 값을 2배 한다.
- `number >> 1`은 값을 반으로 나눈다.

### 1048. 한 번에 2의 거듭제곱 배로 출력하기(설명)

```java
public class P1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = scanner.nextInt();
        int shift = scanner.nextInt();
        int result = base << shift;

        System.out.println(result);

        scanner.close();
    }
}
```

- 이전 문제와 해결방법이 같다. 변수명을 `a`, `b`로 사용할 수 있지만 의도를 전달하기 위해 `base`, `shift`로 리팩터링 했다.

## 비교연산

- 두 정수를 비교, 참이면 `1`, 거짓이면 `0`을 출력한다.
- 비교 연산자: `>`, `<`, `>=`, `<=`, `==`, `!=`
- 비교 결과는 boolean이다. 문제의 요구사항에 맞게 `1`과 `0`으로 변환한다.

## 논리연산

### 1053. 참 거짓 바꾸기

- 입력 조건이 `0`또는 `1`로 명시되어 있을 때 검사하는 로직이 필요할까?

### 1056. 참/거짓이 서로 다를 때에만 출력하기(설명)

- XOR(Exclusive OR)은 두 값이 서로 다를 때만 `true(1)`을 반환한다. 같으면 `false(0)`를 반환한다.
- Java의 `^`연산자는 피연산자의 타입에 따라 다르게 동작한다.
- 논리 XOR: `boolean ^ boolean`
    - 단락 평가(short-circuit)를 사용하지 않는다.
    - 항상 양쪽을 모두 평가한다.
    - 조건 판단에 사용한다.
- 비트 XOR: `int ^ int`(또는 정수형)
    - 각 비트 단위로 연산한다.
    - 비트 토글(Bit Toggle)[^1]에 주로 사용한다.

## 비트단위논리연산

- 웹 개발에 주로 사용하지 않는 연산자라 검색이 필요했다.
- 임베디드(Embedded)[^2] 프로그래밍, 통신, 최적화에 주로 사용한다.

---
[^1]: 비트(bit)의 상태를 반전시킨다. 주로 하드웨어 제어, 암호화, 데이터 압축 등에 사용한다.
[^2]: 기계, 기타 제어가 필요한 시스템에 제어를 위한 기능을 수행하는 컴퓨터 시스템
