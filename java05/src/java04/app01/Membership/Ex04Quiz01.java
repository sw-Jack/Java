package java04.app01.Membership;

import java.util.Scanner;

public class Ex04Quiz01 {
	// 이름, 아이디, 패스워드를 저장하기 위한 멤버 변수 설정
	static String [] names, ids, pws;
	// 배열의 위치를 저장하기 위한 멤버 변수 설정
	static int idx;
	
	// 사용자가 회원의 정보를 입력받을 개수를 지정하기 위해
	// init이라는 메소드를 만들고 size에 입력받을 회원의 수를 저장하면
	// 저장된 회원 수만큼 이름, 아이디, 패스워드 배열을 선언할 수 있다.
	// 예를 들어 init(20)이라고 하면 20명의 정보를 저장할 수 있는 공간이 생성된다.
	static void init(int size) { 
		names = new String[size];
	    ids = new String[size];
	    pws = new String[size];
	    idx = 0;
	}
	 	
	// 사용자가 메뉴를 선택하면 선택된 번호로 각각의 기능을 구현하기 위해 
	// switch문으로 구분한다.
	// 회원가입은 case1과 break 사이에 구현하면 되고
	// 로그인은 cas2와 break 사이에, 마지막으로 종료는 case3과 break 사이에 구현하면 된다.
	static void menu() {
		String menustr = "=================\n";
		menustr += "1.회원가입\n";
		menustr += "2.로그인\n";
		menustr += "3.종료\n";
		menustr += "=================\n";
		menustr += "메뉴를 선택하세요 : ";
		System.out.print(menustr);
	}
	
	static void menuProc(int n) {
		switch(n) {
		case 1 :
			System.out.println("회원가입 선택"); 
			break;
		case 2 :
			System.out.println("로그인 선택"); break;
		case 3 :
			System.out.println("종료 선택"); break;
		default : 
			System.out.println("잘못된 번호입니다"); 
		}
		System.out.println(n + " 입력됨");
	}
	
	static void membership(Scanner in) {
		// 문자열을 입력받기 위해 in.next() 메소드 활용
		// 이름, 아이디, 패스워드는 한명의 정보이므로 
		// names[idx++], ids[idx++]와 같이 사용하면 안된다.
		// 위와 같이 idx++ 하게 되면 names[0], ids[1], pws[2]
		// 형식으로 저장되기 때문에 한 사람의 정보라고 볼 수 없다.
		// 따라서 모든 데이터가 저장된 후 마지막에 idx++을 처리한다.
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
		// 초기값 설정은 main 메소드의 첫번째 줄에 설정한다.
		init(20);
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();
		menuProc(choice);	
		// 만들어진 메소드가 정상적으로 동작되는지 확인하기 위해
		// 이 위치에서 실행
		// Scanner가 main에 만들어져 있으므로 새로 생성하지 않고
		// 인자로 전달하여 membership 메소드에서 활용
		membership(in);		
	}

}
