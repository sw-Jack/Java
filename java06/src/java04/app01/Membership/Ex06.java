package java04.app01.Membership;
import java.util.Scanner;
/* 문자열 비교 시 equals 사용
*/
public class Ex06 {
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
		System.out.print("이름 입력 : ");	// (idx = 2) 부터 시작
		names[idx] = in.next();
		System.out.print("아이디 입력 : ");
		ids[idx] = in.next();
		System.out.print("패스워드 입력 : ");
		pws[idx] = in.next();
		idx++;
		System.out.println("회원가입 축하드립니다!");
	}
	
	static void addMember() {
		names[idx] = "이재우";	// idx = 0
		ids[idx] = "jaewoo";
		pws[idx++] = "1111";	// idx = 1
		
		names[idx] = "홍길동";	// idx = 1 
		ids[idx] = "gildong"; 
		pws[idx++] = "2222";	// idx = 2
	}

	static void outputMembers() {
		System.out.println("\n\n이름\t아이디\t\t패스워드");
		for(int i=0;i<idx;i++)
		{
			System.out.println(names[i] + "\t" + ids[i] + "\t\t" + pws[i]);

		}
	}
	
	public static void main(String[] args) {
	    init(20);
	    addMember();
	   
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력 : ");
		String name = in.next();
		
		// 문자열 비교시 아래 내용은 문자열의 위치를 비교하는 것으로
		// names[0]에 입력된 문자열의 위치와 name에 입력된 문자열의 위치가
		// 서로 다르기 때문에 아래의 내용은 출력이 되지 않는다.
		// 이해되지 않으면 버리기
		if(names[0] == name) {
			System.out.println("틀린 문자열 비교 메소드");
		}
		// 문자열 비교 시 equals 라는 메소드를 사용한다.
		// 위의 말이 어려우면 아래 내용이 "문자열 비교 메소드이다" 라고 외우기
		if(names[0].equals(name))
		{
			System.out.println("올바른 문자열 비교 메소드");
		}
		
		/* menu(); 
		 * menuProc(in.nextInt(), in); 
		 * outputMembers(); 
		 * */	 
	}
}
