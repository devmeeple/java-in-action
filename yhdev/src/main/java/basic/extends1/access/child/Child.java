package basic.extends1.access.child;

import basic.extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1;
//        defaultValue = 1; // 'defaultValue' is not public in 'basic.extends1.access.parent.Parent'. Cannot be accessed from outside package
//        privateValue = 1; // 'privateValue' has private access in 'basic.extends1.access.parent.Parent'

        publicMethod();
        protectedMethod();
//        defaultMethod(); // 'defaultMethod()' is not public in 'basic.extends1.access.parent.Parent'. Cannot be accessed from outside package
//        privateMethod(); // 'privateMethod()' has private access in 'basic.extends1.access.parent.Parent'

        printParent();
    }
}
