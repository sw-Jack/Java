package java04.app01.Membership;

import java.util.Scanner;

public class 회원가입and로그인and종료구현연습 {
	// 이름, 아이디, 비밀번호 저장 배열 생성
	static String [] names, ids, pws;
	// 회원 수 의미하는 인덱스 idx
	static int idx;
	
	// 초기화 메소드 ->  최대 저장 회원 수 설정
	static void init(int size) {
		names = new String [size];
		ids = new String [size];
		pws = new String [size];
		idx = 0;
	}
	
	// 메뉴 출력 메소드
	static void menu() {
		String menuStr = "=======================\n<메뉴>\n";
		menuStr += "1.회원가입\n";
		menuStr += "2.로그인\n";
		menuStr += "3.회원정보 출력\n";
		menuStr += "4.종료\n";
		menuStr += "=======================\n메뉴 선택 : ";
		System.out.print(menuStr);
		}
	
	// 메뉴 선택 및 실행 메소드
	static void menuProc(Scanner in, String n) {
			if(n.equals("1")) {
				System.out.println("<회원가입 페이지>");
				membership(in);
				}
			else if(n.equals("2")) {
				System.out.println("<로그인 페이지>");
				login(in);
				}
			else if(n.equals("3")) {
				System.out.println("<회원정보 출력>");
				outmember();			
				}
			else if(n.equals("4")) {
				System.out.println("프로그램 종료 ...");
				System.exit(0);
				}
			else {
				System.out.println("해당 메뉴가 존재하지 않습니다!! 다시 선택하세요...");
			
		}
	}
	
	// 로그인 메소드 
	static void login(Scanner in) {
		// 아이디, 비밀번호 입력 받기
		System.out.print("아이디 : ");
		String id = in.next();
		System.out.print("비밀번호 : ");
		String pw = in.next();
		
		// 입력 아이디, 비밀번호를  ids, pws 배열에 저장되어 있는 정보와 비교
		for(int i=0; i<idx; i++) {
			if(ids[i].equals(id)) {
				if(pws[i].equals(pw)) {
					System.out.println("로그인 성공! " + ids[i] + "님 안녕하세요^^");
					return;
				}
				else {
					System.out.println("비밀번호가 틀립니다.");			
					return;
				}
			}
		}			
		System.out.println("해당 아이디가 존재하지 않습니다.");
	}
	
	// 회원가입 메소드
	static void membership(Scanner in) {
		System.out.print("이름 : ");
		names[idx]  = in.next();

		System.out.print("아이디 : ");
		ids[idx] =in.next();
		
		System.out.print("비밀번호 : ");
		pws[idx] = in.next();
		
		idx++;
		System.out.println("회원가입을 축하드립니다!!");
	}
	
	// 회원정보 출력 메소드
	static void outmember() {
		System.out.println("<회원정보>\n이름\t\t\t아이디\t\t\t비밀번호");

		for(int i=0; i<idx; i++) {
			System.out.println(names[i] + "\t\t\t" + ids[i] + "\t\t\t" + pws[i]);
		}
	}
	/*
	static void addMember() {
		names[idx] = "이재우";
		ids[idx] = "jaewoo";
		pws[idx++] = "1111";
		
		names[idx] = "홍길동";
		ids[idx] = "gildong";
		pws[idx++] = "2222";
	}
	*/

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		// 초기화 -> (최대)회원 수를 20명으로 설정
		init(20);
		// addMember();
		// 메뉴 출력
		while(true) {
		menu();
		// in 은 Scanner자체를 넘겨준것, in.nextInt() 는 번호 선택 변수
		menuProc(in, in.next());
		}
		// 메뉴 선택
		

	}

}
