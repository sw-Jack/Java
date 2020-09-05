package java05.classBasic.Ex07;

/* 
 * ������
 * �ϳ��� �̸����� ���� ���� ��ü�� ����� ��
 * �������� �̸��� ���� Member��� �̸��� ���� �ִ�.
 * �� �������� ���̴� ������ �����̴�.
 * ������ ���� �Ǵ� ������ ������ �ٸ��� �ϸ� ���������� ǥ���� �� �ִ�.
 */

public class Member {
	private String picture;
	private String id;
	/////////////////////////////////////////////////////////////// ���� �ִ� ��
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
    /////////////////////////////////////////////////////////////// ���� ���� ��
	public Member() { 
		/*
		 * this.id = ""; this.picture = "��������";
		 */
		// this�� �̿��Ͽ� ���� ���ǵǾ� �ִ� ���ڰ� 2���� �����ڸ� ȣ��
		this("", "��������");
	}
	/////////////////////////////////////////////////////////////// 
	
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
