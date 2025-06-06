package mid2.generic.ex3;

import mid2.generic.animal.Dog;

public class DogHospital {
    private Dog animal;

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

    public void set(Dog animal) {
        this.animal = animal;
    }
}
