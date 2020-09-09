package java07.classQuiz.Ex05;
import java.util.Scanner;

/*
 * 쌤 꺼
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

	public static void main(String[] args) {
		L2CharInit l2 = new L2CharInit();
		Scanner in = new Scanner(System.in);
		
		// 초기 화면 출력
		View(l2);
		
		// 새로 생성한 L2CharMenu 클래스의 멤버 변수 호출, 즉 메뉴 선택 화면 출력
		System.out.println(L2CharMenu.JOB);
		
		// 사용자로부터 번호를 입력받아 그 번호를 바로 setJob()에 대입하여 값 설정
		System.out.print("직업 선택 : ");
		l2.setJob(in.nextInt());
		
		// 설정 후의 결과 출력
		View(l2);
	}

}
