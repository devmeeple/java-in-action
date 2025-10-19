package ch21.generic;

public class CardWildcardSample {
    public static void main(String[] args) {
        CardWildcardSample sample = new CardWildcardSample();

        sample.callBoundWildcardMethod();
    }

    public void callBoundWildcardMethod() {
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(new Bus("6900"));
        boundedWildcardMethod(wildcard);
    }

    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
