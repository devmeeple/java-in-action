package ch06;

public class CarEx3 {
    public static void main(String[] args) {
        Car3 car1 = new Car3();
        Car3 car2 = new Car3();

        System.out.println("car1의 color = " + car1.color + ", gearType = " + car1.gearType + ", door = " + car1.door);
        System.out.println("car2의 color = " + car2.color + ", gearType = " + car2.gearType + ", door = " + car2.door);

        car1.door = 100;

        System.out.println("car1.door = 100; 수행 후");
        System.out.println("car1의 color = " + car1.color + ", gearType = " + car1.gearType + ", door = " + car1.door);
        System.out.println("car2의 color = " + car2.color + ", gearType = " + car2.gearType + ", door = " + car2.door);
    }
}

class Car3 {
    String color;
    String gearType;
    int door;

    Car3() {
        this("white", "auto", 4);
    }

    Car3(Car3 car3) {
        color = car3.color;
        gearType = car3.gearType;
        door = car3.door;
    }

    Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
