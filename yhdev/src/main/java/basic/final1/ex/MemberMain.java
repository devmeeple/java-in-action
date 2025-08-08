package basic.final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kims");

        member.print();
        member.chaneData("myId2", "seo");
        member.print();
    }
}
