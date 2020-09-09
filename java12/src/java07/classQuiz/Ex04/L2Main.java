package java07.classQuiz.Ex04;
import java.util.Scanner;

/*
 * 내 꺼
 */

public class L2Main {
	// 결과 화면 출력 메소드 
	public static void View(L2CharInit l2) {
		System.out.println("직업 : " + l2.getJob());
		System.out.println("== 설명 =================================");
		System.out.println(l2.getJobExplain());
		System.out.println("== 머리 스타일 =============================");
		System.out.println(l2.getHair());
	}

	// 직업 선택 메소드
	public static int Choice(Scanner in) {
		System.out.println("===================");
		System.out.println("1.워리어\n2.로그\n3.메이지");
		System.out.println("===================");
		System.out.print("직업 선택 : ");
		int num = in.nextInt();
		// 선택한 번호 반환
		return num;
	}
	
	// 매개 변수로 받은 값(사용자 입력 선택 번호)에 따라 직업 설정(setJob())
	public static void RealChoice(L2CharInit l2, int num) {
		if(num == 2) { l2.setJob(2); }
		else if (num == 3) { l2.setJob(3); }
	}
	
	public static void main(String[] args) {
		L2CharInit l2 = new L2CharInit();
		Scanner in = new Scanner(System.in);
		// 초기 설정 값에 대한 결과 화면 출력
		View(l2);
		
		// Choice() 메소드 호출로 반환받은 값 val 변수에 저장
		int val = Choice(in);
		// 사용자 선택 값 RealChoice() 메소드로 보내 직업 설정
		RealChoice(l2,val);
		// 직업 설정 후 결과 화면 출력
		View(l2);
	}
}

