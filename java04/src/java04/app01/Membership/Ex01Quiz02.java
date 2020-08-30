package java04.app01.Membership;

import java.util.Scanner;

public class Ex01Quiz02 {
	// 메뉴 선택창 출력 메소드
	static void menu() {
		String menustr = "=================\n";
		menustr += "1.회원가입\n";
		menustr += "2.로그인\n";
		menustr += "3.종료\n";
		menustr += "=================\n";
		menustr += "메뉴를 선택하세요 : ";
		System.out.print(menustr);
	}
	// 입력받은 변수 출력 메소드
	static void mainMenuExec(int n) {
		System.out.println(n + " 입력됨");
	}
	public static void main(String[] args) {	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();
		mainMenuExec(choice);
		
	}

}
