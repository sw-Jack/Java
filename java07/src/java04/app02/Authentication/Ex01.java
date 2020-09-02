package java04.app02.Authentication;


import java.util.Scanner;

/* 메소드 생성 시 출력은 main에서만 한다.
 * return은 호출한 지역으로 값을 전달할 경우 사용한다. 
 */

public class Ex01 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int insertNum = in.nextInt();
		// 1. getCertiNum에 입력 받은 정수 전달
		// 4. 메소드 실행 후 return으로 전달 받은 값은 certiNum에 저장
		int certiNum = getCertiNum(insertNum);
		System.out.println("입력값 : " + insertNum);
		System.out.println("인증번호 : " + certiNum);

	}

	static int getCertiNum(int n) {
		// 2. 전달 받은 n에 2를 곱하여 인증 번호 생성
		int certiNum = n * 2;
		// 3. getCertiNum을 호출한 main에 인증 번호 전달
		return certiNum;
	}
}
