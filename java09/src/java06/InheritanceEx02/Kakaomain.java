package java06.InheritanceEx02;

/* 
 * 별도의 멤버라는 객체를 만들어 기존의 Talkbox 객체에 연결할 수 있다.
 * Talkbox내에 member라는 객체가 존재하고 별도로 Member 객체를 생성하여 연결하였으므로
 * member에 있는 정보와 talkbox.getmember()의 정보는 같은 값을 갖게 된다.
 */

public class Kakaomain {
	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
		Member member = new Member();
		
		member.setId("내 아이디");    // 
		member.setPicture("기본그림");   //
		
		talkbox.setContents("좋은 아침");
		talkbox.setChatTime("아침시간");
		
		// member.setId(), member.setPicture()로 초기화한 값을 Talkbox에 전달
		talkbox.setMember(member);    
		
		// 단순 Member 클래스에 대한 정보 출력
		System.out.println(talkbox.getMember());
		// Member 클래스의  id (Talkbox 클래스를 거쳐감)
		System.out.println(talkbox.getMember().getId());
		// Member 클래스의 id
		System.out.println(member.getId());
		// Member 클래스의 picture (Talkbox 클래스를 거쳐감)
		System.out.println(talkbox.getMember().getPicture());
		// Member 클래스의 picture
		System.out.println(member.getPicture());
		
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
	}
}
