package java06.InheritanceEx04;

/*
 * ���
 * ����̶�� ���� class�� �ٸ� class���� ��� ������ �������ִ� ��
 * ����� �� ��� extends ��� Ű���带 �̿��Ͽ� class�� ��ӽ�ų �� �ִ�.
 * ��ӵ� class�� ������ ��ü ����(new) ���� ������ ��� public �޼ҵ带 ����� �� �ִ�.
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
	

