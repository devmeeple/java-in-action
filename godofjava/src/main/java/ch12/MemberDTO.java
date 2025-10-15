package ch12;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
