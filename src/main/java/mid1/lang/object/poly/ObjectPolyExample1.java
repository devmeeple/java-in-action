package mid1.lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object ob) {
//        obj.sound();
//        obj.move();

        if (ob instanceof Dog dog) {
            dog.sound();
        } else if (ob instanceof Car car) {
            car.move();
        }
    }
}
