

package java05.classBasic.Ex03;
// ��ĭ - source - generate Getter and Setter
public class Member {
	private String picture;
	private String id;
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		//this : �ڽ��� Ŭ������ ���� ��ü : class Member �Ʒ� ��
		this.picture = picture;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}


