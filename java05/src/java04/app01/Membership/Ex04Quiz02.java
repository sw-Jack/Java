package java04.app01.Membership;

import java.util.Scanner;

public class Ex04Quiz02 {
	static String [] names, ids, pws;
	static int idx;
	
	static void init(int size) { 
		names = new String[size];
	    ids = new String[size];
	    pws = new String[size];
	    idx = 0;
	}
	 	
	static void menu() {
		String menustr = "=================\n";
		menustr += "1.회원가입\n";
		menustr += "2.로그인\n";
		menustr += "3.종료\n";
		menustr += "=================\n";
		menustr += "메뉴를 선택하세요 : ";
		System.out.print(menustr);
	}
	
	static void menuProc(int n, Scanner in) {
		switch(n) {
		case 1 :
			System.out.println("회원가입 선택"); 
			// 회원가입을 처리하기 위해 main에서 이동된 메소드
			membership(in);
			break;
		case 2 :
			System.out.println("로그인 선택"); break;
		case 3 :
			System.out.println("종료 선택"); break;
		default : 
			System.out.println("잘못된 번호입니다"); 
		}
	}
	
	static void membership(Scanner in) {
		System.out.print("이름 입력 : ");
		names[idx] = in.next();
		System.out.print("아이디 입력 : ");
		ids[idx] = in.next();
		System.out.print("패스워드 입력 : ");
		pws[idx] = in.next();
		idx++;
		System.out.println("회원가입 축하드립니다!");
	}
	
	public static void main(String[] args) {
		init(20);
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		menu();
		
		// int choice = in.nextInt();
		// membership에서 in을 입력받아야 하고
		// case1에서 membership 메소드가 사용되고 있으므로
		// main 에서 입력받아 전달해야 한다.
		// menuProc(choice, in);
		
		// membership은 회원가입을 선택했을 경우 동작되어야하므로
		// menuProc의 case1으로 이동시킨다.
		// membership(in);
		menuProc(in.nextInt(), in);
	}
}
