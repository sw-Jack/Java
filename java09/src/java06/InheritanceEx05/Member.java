package java06.InheritanceEx05;

public class Member {
	private String id;
	private String picture;
	// **** 클래스 분리 시 각 클래스마다 항상 기본적으로 생성자 2가지 꼭 만들기, 필요시 추가 생성 
	// 1. 기본 인자를 가진 생성자
	public Member(String id, String picture) {
		this.id = id;
		this.picture = picture;
	}
	// 2. 인자를 가지지 않은 default 생성자
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
