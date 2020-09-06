package java06.InheritanceEx03;

/* 
 * Member객체를 생성해서 talkbox에 전달하고
 * recvMember라는 객체를 만들어 talkbox에 있는 member객체를 전달하면
 * recvMember가 기존의 member객체와 같은 값을 갖게 된다.
 */

public class Kakaomain {
	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
		Member member = new Member();
		// 새로운 Member 클래스 객체 생성
		Member recvMember; 
		
		member.setId("내 아이디");
		member.setPicture("기본그림");
		
		// talkbox.setContents("좋은 아침");
		// talkbox.setChatTime("아침시간");
		
		talkbox.setMember(member);
		
		// talkbox의 getter를 하나의 객체로 새로 받음
		recvMember = talkbox.getMember();
		
		System.out.println(recvMember.getId());
		System.out.println(recvMember.getPicture());
	}
}
