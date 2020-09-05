

package java05.classBasic.Ex03;
// 빈칸 - source - generate Getter and Setter
public class Member {
	private String picture;
	private String id;
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		//this : 자신의 클래스에 대한 객체 : class Member 아래 값
		this.picture = picture;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}


