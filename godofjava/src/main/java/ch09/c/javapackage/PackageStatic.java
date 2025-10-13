package ch09.c.javapackage;

import static ch09.c.javapackage.sub.SubStatic.CLASS_NAME;
import static ch09.c.javapackage.sub.SubStatic.subStaticMethod;

public class PackageStatic {
    public static void main(String[] args) {
        subStaticMethod();
        System.out.println(CLASS_NAME);
    }
}
