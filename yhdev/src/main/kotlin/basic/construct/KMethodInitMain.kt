package basic.construct

fun main() {
    val member1 = KMemberInit("user1", 15, 90)
    val member2 = KMemberInit("user2", 16, 80)

    val members = listOf(member1, member2)

    for (member in members) {
        println("이름: ${member.name}, 나이: ${member.age}, 성적: ${member.grade}")
    }
}