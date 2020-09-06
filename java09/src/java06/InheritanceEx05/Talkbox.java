package java06.InheritanceEx05;

/*
 * "this" vs "super"
 * this는 클래스 자신을 의미하며 super는 상속 받은 부모 클래스를 의미한다.
 * 아래 코드에서 this는 Talkbox를 의미하며
 * this(id,picture) 라고 사용하면 Talkbox 클래스의 생성자 중
 * 인자가 2개인 생성자를 호출하겠다는 의미이다.
 * super(id,picture)로 사용하게 되면 Member 클래스의 생성자 중
 * 인자가 2개인 생성자를 호출하겠다는 의미이다.
 * 메소드를 호출할 경우 
 * this.getContents("test"), super.getId("testId")
 * 위와 같이 사용할 수 있다.
 */

public class Talkbox extends Member {
	private String contents;
	private String chatTime; 
	
	// 인수 4개 짜리 생성자 새로 생성(부모 클래스, 자식 클래스 한번에 초기화)
	public Talkbox(String id, String picture, String contents, String chatTime) {
		// 상속 시, 부모 클래스 해당 정보는 super, 나 자신 클래스는 this
		super(id,picture);		
		// 자신
		this.contents = contents;
		this.chatTime = chatTime;
	}
	
	// 기본 생성자
	public Talkbox(String contents, String chatTime) {
		this.contents = contents;
		this.chatTime = chatTime;
	}
    public Talkbox() {
		this("","");
	}
  
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
