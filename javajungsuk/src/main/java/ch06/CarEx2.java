package ch06;

public class CarEx2 {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        Car2 car2 = new Car2();

        System.out.println("car1의 color = " + car1.color + ", gearType = " + car1.gearType + ", door = " + car1.door);
        System.out.println("car2의 color = " + car2.color + ", gearType = " + car2.gearType + ", door = " + car2.door);
    }
}

class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
