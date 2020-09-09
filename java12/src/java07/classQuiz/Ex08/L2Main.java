package java07.classQuiz.Ex08;
import java.util.Scanner;

import java07.classQuiz.Ex07.L2CharInit;
import java07.classQuiz.Ex07.L2CharMenu;

/*
 * 쌤 꺼에 머리 추가 version 2
 */

public class L2Main {
	public static void View(L2CharInit l2) {
		System.out.println("직업 : " + l2.getJob());
		System.out.println("== 설명 =================================");
		System.out.println(l2.getJobExplain());
		System.out.println("== 머리 스타일 =============================");
		System.out.println(l2.getHair());
	}

	// 메뉴 실행 메소드 생성 : boolean 값 반환 이용
	public static boolean MenuProc(L2CharInit l2) {
		Scanner in = new Scanner(System.in);
		switch(in.nextInt()) {
		case 1 : 
			// 1번 입력시 직업 선택창 출력
			System.out.println(L2Menu.getMenu(L2Menu.JOB));
			// 직업 선택 번호 입력
			System.out.print("직업 선택 : ");
			l2.setJob(in.nextInt());
			// true 반환
			return true;
		case 2 : 
			// 2번 입력시 머리 스타일 선택창 출력
			System.out.println(L2Menu.getMenu(L2Menu.HAIR));
			// 머리 스타일 번호 입력
			System.out.print("머리 스타일 선택 : ");
			l2.setHair(in.nextInt());
			// true 반환ㄴ
			return true;
		case 3 : 
			// 3번 입력시 이름 입력창 출력
			System.out.print("이름 입력 : ");
			// 이름 입력
			l2.setNickName(in.next());
			// true 반환
			return true;
		}
		// 이외의 값은 false를 반환
		return false;
	}
	
	public static void main(String[] args) {
		L2CharInit l2 = new L2CharInit();
		Scanner in = new Scanner(System.in);
		
		boolean isComplete = true;
		// isComplete 값에 따른 반복문 생성
		// isComplete 값이 false가 되면 탈출
		while(isComplete) {
			View(l2);
			
			// 전체 메뉴창 출력
		    System.out.println(L2Menu.getMenu(L2Menu.MENU));
		    System.out.print("메뉴 선택 : ");
		    // 선택 후 메뉴 실행 메소드 MenuProc() 실행 후 반환 값 isComplete로 저장
		    // 반환 값, 즉 isComplete가 true면 반복문 계속 실행
		    // false이면 반복문 종료(캐릭터 생성 완료)
		    isComplete = MenuProc(l2);
		}
		// 반복문 종료(캐릭터 생성 완료) 후 결과 화면 출력
		View(l2);
		// 닉네임 + 캐릭터 생성 완료 문구 출력
		System.out.println(l2.getNickName() + "캐릭터 생성이 완료되었습니다.");
	
	}
}




