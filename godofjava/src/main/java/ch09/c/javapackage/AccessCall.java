package ch09.c.javapackage;

import ch09.c.javapackage.sub.AccessModifier;

public class AccessCall {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();

        accessModifier.publicMethod();
//        accessModifier.protectedMethod();
//        accessModifier.packagePrivateMethod();
//        accessModifier.privateMethod();
    }
}
