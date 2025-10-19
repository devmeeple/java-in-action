package ch21.generic;

public class CardWildcardSample {
    public static void main(String[] args) {
        CardWildcardSample sample = new CardWildcardSample();

        sample.callBoundWildcardMethod();
    }

    public void callBoundWildcardMethod() {
        WildcardGeneric<Car> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(new Car("Mustang"));
        boundedWildcardMethod(wildcard);
    }

    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
