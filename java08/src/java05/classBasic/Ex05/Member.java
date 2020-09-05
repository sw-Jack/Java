package java05.classBasic.Ex05;

/* 
 * ������ : �ʱⰪ�� �����ϱ� ���� ��
 * �����̶�� ���� �����ΰ� ����� ���ٴ� �����̴�. 
 * �����ڶ� new�� �̿��Ͽ� ��ü�� ���� �� ���۵Ǵ� �޼ҵ��̴�.
 * ��ü�� ������ ��� ���ʷ� ���� ������ �� ����Ѵ�.
 * �����ڴ� ��ȯ �ڷ����� ������, Ŭ������ ���� �̸��̾�� �Ѵ�.
 */

public class Member {
	private String picture;
	private String id;
	
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
	
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
