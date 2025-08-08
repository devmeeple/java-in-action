package mid2.generic.ex4;

import mid2.generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
//        t.getName();
        return t;
    }

    public void set(T animal) {
        this.animal = animal;
    }
}
