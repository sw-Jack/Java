package java04.app02.Authentication;

import java.util.Scanner;

/* <메소드 매개변수는 있지만  return 값이 없는 경우>
 * 1. 값을 입력받는다.
 * 2. 인증번호를 생성한다.
 * 3. 입력받은 값과 인증번호를 출력한다.
 */
public class Ex01 {
	public static void main(String[] args) {
		// Scanner 이용 시 나타나는 경고 무시
		@SuppressWarnings("resource")
		// 입력 받기 위한 Scanner 객체 생성
		Scanner in = new Scanner(System.in);
		// 화면에 "수를 입력하세요" 출력
		System.out.print("수를 입력하세요 : ");
		// in.nextInt() 메소드를 이용하여 정수를 입력받고 insertNum에 저장
		int insertNum = in.nextInt();
		// 입력받은 insertNum 출력
		System.out.println("입력값 : " + insertNum);
		// getCertiNum의 인자로 입력받은 insertNum의 값을 전달
		getCertiNum(insertNum);

	}
	// static은 main에서 static이 사용되어 붙게됨
	// void는 main으로 전달할 값이 없을 경우 사용됨
	// int n은 getCertiNum을 호출한 지역에서 정수로 값을 전달할 경우 받는 변수
	// 즉, main에서 getCertiNum(insertNum);을 호출하면서 
	// int n = insertNum과 같이 동작됨
	static void getCertiNum(int n) {
		// 입력받은 n을 2로 곱한 후 certiNum에 저장
		int certiNum = n * 2;
		// 저장된 certiNum을 출력
		System.out.println("인증번호 : " + certiNum);
	}
}
