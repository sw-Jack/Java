package java04.app01.Membership;

import java.util.Scanner;

public class Ex01Quiz01 {
	/* 메소드는 행위라는 뜻으로 무엇인가 동적인 처리를 할때 만들어 사용할 수 있다.
	 * 메소드는 아래와 같은 형식을 갖는다.
	 * [반환자료형] [메소드이름]([입력데이터]...)
	 * 반환 자료형과 입력 데이터는 추후 확인해보자
	 * 
	 * 현재 main에서 menu라는 메소드를 호출하는데 main에 static이라는 키워드가 있기 때문에
	 * menu에도 static이라는 키워드를 적어 주어야 한다.
	 * 
	 * 데이터 출력 시 출력 함수를 여러번 사용하는 것보다
	 * 아래 코드처럼 출력할 내용을 문자열에 저장한 후
	 * 한번에 출력하는 것이 더 효율적이다.
	 */
	static void menu() {
		String menustr = "=================\n";
		menustr += "1.회원가입\n";
		menustr += "2.로그인\n";
		menustr += "3.종료\n";
		menustr += "=================\n";
		menustr += "메뉴를 선택하세요 : ";
		System.out.println(menustr);
	}
	public static void main(String[] args) {	
		menu();
	}

}
