package ch17.annotation;

public class AnnotationOverride extends Parent {
    @Override
    public void printName() {
        System.out.println("AnnotationOverride");
    }
}
