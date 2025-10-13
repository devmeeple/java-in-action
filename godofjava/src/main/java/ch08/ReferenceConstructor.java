package ch08;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }

    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Taegeun");
        MemberDTO dto3 = new MemberDTO("Taegeun", "010XXXXYYYY");
        MemberDTO dto4 = new MemberDTO("Taegeun", "010XXXXYYYY", "devmeeple@gmail.com");
    }
}
