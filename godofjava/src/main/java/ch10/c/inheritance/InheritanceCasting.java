package ch10.c.inheritance;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        inheritance.objectCastArray();
    }

    public void objectCastArray() {
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();

        objectTypeCheck(parentArray);
    }

    private void objectTypeCheck(ParentCasting[] parentArray) {
        for (ParentCasting temParent : parentArray) {
            if (temParent instanceof ChildCasting) {
                System.out.println("ChildCasting");
                ChildCasting tempChild = (ChildCasting) temParent;
                tempChild.printAge();
            } else if (temParent instanceof ParentCasting) {
                System.out.println("ParentCasting");
            }
        }
    }
}
