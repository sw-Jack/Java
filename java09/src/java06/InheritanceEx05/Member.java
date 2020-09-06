package java06.InheritanceEx05;

public class Member {
	private String id;
	private String picture;
	// **** Ŭ���� �и� �� �� Ŭ�������� �׻� �⺻������ ������ 2���� �� �����, �ʿ�� �߰� ���� 
	// 1. �⺻ ���ڸ� ���� ������
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
	// 2. ���ڸ� ������ ���� default ������
	public Member() {
		this("","");
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String pricture) {
		this.picture = pricture;
	}
}
