package java05.classBasic.Ex05;

/* 
 * 생성자 : 초기값을 설정하기 위한 것
 * 생성이라는 것은 무엇인가 만들어 진다는 개념이다. 
 * 생성자란 new를 이용하여 객체를 만들 때 동작되는 메소드이다.
 * 객체를 생성할 경우 최초로 값을 지정할 때 사용한다.
 * 생성자는 반환 자료형이 없으며, 클래스와 같은 이름이어야 한다.
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
