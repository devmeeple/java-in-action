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
