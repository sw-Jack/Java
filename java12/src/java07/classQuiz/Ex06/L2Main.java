package java07.classQuiz.Ex06;
import java.util.Scanner;

/*
 * 쌤 꺼에 머리 추가 version 1
 */

public class L2Main {
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
		
		View(l2);
		
		// 직업 선택
		System.out.println(L2CharMenu.JOB);
		System.out.print("직업 선택 : ");
		// 선택 값 설정
		l2.setJob(in.nextInt());
		
		// 머리 선택
		System.out.println(L2CharMenu.HAIR);
		System.out.print("머리 스타일 선택 : ");
		// 선택 값 설정
		l2.setHair(in.nextInt());
		
		System.out.println();
		
		View(l2);
	}
}
