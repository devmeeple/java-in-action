package ch21.generic;

public class CardWildcardSample {
    public static void main(String[] args) {
        CardWildcardSample sample = new CardWildcardSample();

        sample.callGenericMethod();
    }

    public void callGenericMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        genericMethod(wildcard, "Data");
    }

    public <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }
}
