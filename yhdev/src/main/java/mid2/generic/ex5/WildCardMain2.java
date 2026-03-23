package mid2.generic.ex5;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class WildCardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox); // 'writeBox(mid2.generic.ex5.Box<? super mid2.generic.animal.Animal>)' in 'mid2.generic.ex5.WildCardMain2' cannot be applied to '(mid2.generic.ex5.Box<mid2.generic.animal.Dog>)'
//        writeBox(catBox); // 'writeBox(mid2.generic.ex5.Box<? super mid2.generic.animal.Animal>)' in 'mid2.generic.ex5.WildCardMain2' cannot be applied to '(mid2.generic.ex5.Box<mid2.generic.animal.Cat>)'

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
