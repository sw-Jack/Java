

package java05.classBasic.Ex03;
/* 
 * this는 클래스 자신을 의미한다.
 * this.xxx 하면 현재 클래스 내의  xxx 를 의미하게 된다.
 * 멤버 변수를 만들 경우 무조건 private를 붙인다.
 * private는 외부에서의 직접적인 접근을 막기 위해 사용한다.
 */
public class Ex01 {
	public static void main(String[] args) {
		Member member = new Member();
		
		// set : 해당 클래스 내의 변수에 값 설정
		member.setId("홍길동");
		member.setPicture("사진없음.");
	
		// get : set으로 저장한 클래스 내의 변수 값 불러오기
		System.out.println(member.getId());
		System.out.println(member.getPicture());
	}
} 



