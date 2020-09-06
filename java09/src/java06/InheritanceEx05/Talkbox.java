package java06.InheritanceEx05;

/*
 * "this" vs "super"
 * this�� Ŭ���� �ڽ��� �ǹ��ϸ� super�� ��� ���� �θ� Ŭ������ �ǹ��Ѵ�.
 * �Ʒ� �ڵ忡�� this�� Talkbox�� �ǹ��ϸ�
 * this(id,picture) ��� ����ϸ� Talkbox Ŭ������ ������ ��
 * ���ڰ� 2���� �����ڸ� ȣ���ϰڴٴ� �ǹ��̴�.
 * super(id,picture)�� ����ϰ� �Ǹ� Member Ŭ������ ������ ��
 * ���ڰ� 2���� �����ڸ� ȣ���ϰڴٴ� �ǹ��̴�.
 * �޼ҵ带 ȣ���� ��� 
 * this.getContents("test"), super.getId("testId")
 * ���� ���� ����� �� �ִ�.
 */

public class Talkbox extends Member {
	private String contents;
	private String chatTime; 
	
	// �μ� 4�� ¥�� ������ ���� ����(�θ� Ŭ����, �ڽ� Ŭ���� �ѹ��� �ʱ�ȭ)
	public Talkbox(String id, String picture, String contents, String chatTime) {
		// ��� ��, �θ� Ŭ���� �ش� ������ super, �� �ڽ� Ŭ������ this
		super(id,picture);		
		// �ڽ�
		this.contents = contents;
		this.chatTime = chatTime;
	}
	
	// �⺻ ������
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
