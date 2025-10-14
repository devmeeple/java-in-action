package ch10.c.inheritance;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        inheritance.objectCast2();
    }

    public void objectCast2() {
        ChildCasting child = new ChildCasting();
        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting) parent2;
    }
}
