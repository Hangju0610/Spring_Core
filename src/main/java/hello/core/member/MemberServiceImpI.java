package hello.core.member;

public class MemberServiceImpI implements MemberService {
    // 현재 다른 저장소로 변경할 때, OCP 원칙을 준수하지 않고 있음
    // MemoryMemberRepository 클래스에 의존 및 memberRepository 인터페이스에 의존
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
