package ch17.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 적용 대상: 생성자, 지역 변수, 메서드 등
@Retention(RetentionPolicy.RUNTIME) // 정보가 얼마나 오래 유지되는가
public @interface UserAnnotation {
    public int number();

    public String text() default "This is first annotation";
}
