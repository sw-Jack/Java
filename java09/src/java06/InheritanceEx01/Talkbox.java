package java06.InheritanceEx01;

/*
 * ������ Member Ŭ������ id�� picture�� ������ �־���.
 * �̸� �״�� �޾Ƽ� Talkbox�� �����ϸ� Talkbox�� id�� picture�� ���� �ʿ䰡 ���� ������
 * private String id, private String picture ���
 * private Member member�� ����ϰ� �Ǿ���.
 */

public class Talkbox {
	// id, picture, contents, chatTime
			private String contents;
			private String chatTime; 
			private Member member;   // private String id;   private String picture
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
			public Member getMember() {
				return member;
			}
			public void setMember(Member member) {
				this.member = member;
			}
}
