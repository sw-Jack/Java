package java05.classBasic.Ex07;

/* 
 * 다형성
 * 하나의 이름으로 여러 개의 객체를 만드는 것
 * 생성자의 이름을 보면 Member라는 이름을 갖고 있다.
 * 두 생성자의 차이는 인자의 유무이다.
 * 인자의 개수 또는 인자의 종류를 다르게 하면 다형성으로 표현할 수 있다.
 */

public class Member {
	private String picture;
	private String id;
	/////////////////////////////////////////////////////////////// 인자 있는 것
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
    /////////////////////////////////////////////////////////////// 인자 없는 것
	public Member() { 
		/*
		 * this.id = ""; this.picture = "사진없음";
		 */
		// this를 이용하여 위의 정의되어 있는 인자가 2개인 생성자를 호출
		this("", "사진없음");
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
