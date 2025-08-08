package god.chapter08;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }

    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("TaeGeun");
        MemberDTO dto3 = new MemberDTO("TaeGeun", "010XXXXYYYY");
        MemberDTO dto4 = new MemberDTO("TaeGeun", "010XXXXYYYY", "god@godofjava.com");
    }
}
