package java06.InheritanceEx04;

/*
 * 상속
 * 상속이라는 것은 class가 다른 class에게 모든 내용을 전달해주는 것
 * 상속을 할 경우 extends 라는 키워드를 이용하여 class를 상속시킬 수 있다.
 * 상속된 class는 별도의 객체 생성(new) 없이 내부의 모든 public 메소드를 사용할 수 있다.
 */

// Talkbox extends Member : Member >> Talkbox
public class Talkbox extends Member {
	private String contents;
	private String chatTime; 	
	// private Member member;  
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getChatTime() {
		return chatTime;
	}
	public void setChatTime(String chatTime) {
		this.chatTime = chatTime;
	}
}

	/*
	 * public Member getMember() { 
	 * return member; 
	 * } 
	 * public void setMember(Member member) { 
	 * this.member = member; 
	 * }
	 */
	

