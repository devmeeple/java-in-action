package basic.final1.ex;

public class Member {

    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
//        this.id = id; // Cannot assign a value to final variable 'id'
        this.name = name;
    }

    public void print() {
        System.out.println("id:" + id + ", name:" + name);
    }
}
