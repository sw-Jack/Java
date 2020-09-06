package java06.InheritanceEx01;

/*
 * 기존에 Member 클래스가 id와 picture를 가지고 있었다.
 * 이를 그대로 받아서 Talkbox에 구현하면 Talkbox에 id와 picture를 적을 필요가 없기 때문에
 * private String id, private String picture 대신
 * private Member member를 사용하게 되었다.
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
