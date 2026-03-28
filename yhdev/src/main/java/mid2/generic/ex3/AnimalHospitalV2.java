package mid2.generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용 가능
        animal.toString();
        animal.equals(null);

//        System.out.println("동물 이름: " + animal.getName()); // Cannot resolve method 'getName' in 'T'
//        System.out.println("동물 크기: " + animal.getSize()); // Cannot resolve method 'getSize' in 'T'
//        animal.sound(); // Cannot resolve method 'sound' in 'T'
    }

    public T getBigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target; //Cannot resolve method 'getSize' in 'T'
        return null;
    }

    public void set(T animal) {
        this.animal = animal;
    }
}
