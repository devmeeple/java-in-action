package mid2.collection.map.test.member;

/**
 * 문제6: 회원 관리 저장소
 * 1) MemberRepository 선언
 */
public class MemberRepositoryMain {
    public static void main(String[] args) {
        Member member1 = new Member("id1", "회원1");
        Member member2 = new Member("id2", "회원2");
        Member member3 = new Member("id3", "회원3");

        MemberRepository repository = new MemberRepository();
        repository.save(member1);
        repository.save(member2);
        repository.save(member3);

        Member findMember1 = repository.findById("id1");
        System.out.println("findMember1 = " + findMember1);

        Member findMember3 = repository.findByName("회원3");
        System.out.println("findMember3 = " + findMember3);

        repository.remove("id1");
        Member removedMember1 = repository.findById("id1");
        System.out.println("removedMember1 = " + removedMember1);
    }
}
