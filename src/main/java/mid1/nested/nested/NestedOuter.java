package mid1.nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            System.out.println(nestedInstanceValue);

//            System.out.println(outInstanceValue);

            System.out.println(NestedOuter.outClassValue);
        }
    }
}
