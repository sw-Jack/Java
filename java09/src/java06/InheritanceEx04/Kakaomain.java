package java06.InheritanceEx04;

public class Kakaomain {
	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
		
		// Member 클래스 객체를 생성하지 않고 
		// Member 클래스를 상속 받은 Talkbox 클래스의 객체만
		// 생성하여 setter로 값을 지정하고 getter 값을 출력할 수 있다.
		talkbox.setId("내 아이디");
		talkbox.setPicture("기본 사진");
		talkbox.setContents("좋은 아침");
		talkbox.setChatTime("아침시간");
		
		System.out.println(talkbox.getId());
		System.out.println(talkbox.getPicture());
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
	}
}
