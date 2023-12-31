package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpI;

/**
 * 순수 자바 코드로 테스트
 * 앱 로직으로 테스트하는 것은 좋지 않음.
 */
public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpI();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());

    }
}
