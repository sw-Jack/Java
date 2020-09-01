package java04.app02.Authentication;

import java.util.Scanner;

/* <메소드 매개변수와  return 값 모두 존재하는 경우>
 * 메소드 생성 시 출력은 main에서만 한다.
 * return은 호출한 지역으로 값을 전달할 경우 사용한다. 
 */

public class Ex02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		// 사용자 값 입력
		int insertNum = in.nextInt();
		// 사용자 입력값 출력
		System.out.println("입력값 : " + insertNum);
		
		// 호출된 메소드 getCertiNum에서 다시 반환하여 준 return 값을 받아줄 변수  certiNum 생성
		int certiNumber = getCertiNum(insertNum);
		

		// getCertiNum 메소드 호출로 처리되어 받아온 return 값 certiNumber 출력
		System.out.println("인증번호 : " + certiNumber);

	}

	// return 값, 즉 정수형 반환값이 존재하기 때문에 메소드의 void가 아닌 int가 됨
	static int getCertiNum(int n) {
		
		// main에서 입력받은 insertNum을 매개변수 n이 받아 그 n값에 2를 곱한 후
		int certiNum = n * 2;
		
		// 호출한 곳으로 반환
		return certiNum;
	}
}
