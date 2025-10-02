package ch04;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint();
        byte age = 70;
        String name = "James Arthur Gosling";
        boolean isMarried = true;

        profile.setAge(age);
        profile.setName(name);
        profile.setMarried(isMarried);

        System.out.println(profile.getAge());
        System.out.println(profile.getName());
        System.out.println(profile.isMarried());
    }

    public byte getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
}
