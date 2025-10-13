package ch08;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        reference.callPassByReference();
    }

    public void callPassByReference() {
        MemberDTO member = new MemberDTO("Taegeun");

        System.out.println("Before passByReference()");
        System.out.println("member.name = " + member.name);

        passByReference(member);
        System.out.println("After passByReference()");
        System.out.println("member.name = " + member.name);
    }

    public void passByReference(MemberDTO member) {
        member.name = "Geuntae";

        System.out.println("In passByReference()");
        System.out.println("member.name = " + member.name);
    }
}
