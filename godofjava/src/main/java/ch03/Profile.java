package ch03;

public class Profile {
    String name;
    int age;

    public static void main(String[] args) {
        Profile profile = new Profile();
        String name = "Min";
        int age = 20;

        profile.setName(name);
        profile.setAge(age);

        profile.printName();
        profile.printAge();
    }

    public void printName() {
        System.out.println("My name is " + name);
    }

    public void printAge() {
        System.out.println("My age is " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int val) {
        this.age = val;
    }
}
