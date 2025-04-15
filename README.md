# Java in Action

- [The Java™ Tutorials ](https://docs.oracle.com/javase/tutorial/)
- [Kotlin Docs](https://kotlinlang.org/docs/home.html)
- [dev.java](https://dev.java/)
- [김영한의 실전 자바](https://inf.run/7KDww)
- [만들어 가면서 배우는 JAVA 플레이그라운드](https://inf.run/FgzS)

## 제어자(Modifier)

- 자바에서는 접근 제어자(Access modifiers), 코틀린에서는 가시성 제어자(Visibility modifiers)라 부른다.
- 접근, 가시성 제어자는 캡슐화의 핵심이다.
- 자바의 기본 제어자는 `default`, 코틀린은 `public`이다.
- **종류**
  - 자바: `private`, `default`, `protected`, `public`
  - `default`는 `package-private`라고 부른다. 동일한 패키지 내의 다른 클래스만 접근 가능하다.
  - 코틀린: `private`, `protected`, `internal`, `public`

- [The Java™ Tutorials 'Controlling Access to Members of a Class'](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- [Kotlin Docs 'Visibility modifiers'](https://kotlinlang.org/docs/visibility-modifiers.html)

### 캡슐화

캡슐화는 외부세계(사용자)와 소통하는 방법이다. 사용자가 알아야 하는 핵심 정보는 공개하고, 필요하지 않은 정보는 숨긴다.
접근 제어자는 캡슐화, 의도를 표현하는 적절한 방법이라 생각한다.

### Setter

코틀린에서 `setter`를 사용하는 3가지 방법을 살펴본다.

1. backing property
2. custom setter
3. `setter`를 열어두고 사용하지 않기
   - Trade-Off, 팀 컨벤션 중요

**<참고 자료>**

- [최태현 '코틀린으로 엔티티 작성'](https://www.inflearn.com/community/questions/593405)
- [최태현 'setter에 대해서 궁금점이 있습니다.'](https://www.inflearn.com/community/questions/633711)
