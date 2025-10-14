package ch10.ex;

public class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("Cat move()");
    }

    @Override
    public void eatFood() {
        System.out.println("Cat eatFood()");
    }
}
