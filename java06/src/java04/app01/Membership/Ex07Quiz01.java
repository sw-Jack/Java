package java04.app01.Membership;
import java.util.Scanner;
/* Quiz
 * 로그인 구현
 */

public class Ex07Quiz01 {
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
			System.out.println("\n<회원가입>"); 
			membership(in);
			break;
		case 2 :
			System.out.println("\n<로그인>"); 
			loginProc(in);
			break;
		case 3 :
			System.out.println("\n<종료>"); break;
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
	
	static void addMember() {
		names[idx] = "이재우";
		ids[idx] = "jaewoo";
		pws[idx++] = "1111";
		
		names[idx] = "홍길동";
		ids[idx] = "gildong";
		pws[idx++] = "2222";
	}

	static void outputMembers() {
		System.out.println("\n\n이름\t아이디\t\t패스워드");
		for(int i=0;i<idx;i++)
		{
			System.out.println(names[i] + "\t" + ids[i] + "\t\t" + pws[i]);

		}
	}
	
	static void loginProc(Scanner in) {
		while(true) {
		// id와 pw 입력받기
		System.out.print("아이디 입력 : ");
		String id = in.next();
		System.out.print("패스워드 입력 : ");
		String pw = in.next();
		// 배열이 0부터 시작하므로 0번부터 회원 정보의 최대값인 idx까지 반복
		for(int i=0;i<idx;i++) {
			// id가 같은지 비교
			if(ids[i].equals(id)) {
				// pw가 같은지 비교
				if(pws[i].equals(pw)) {
					// id와 pw가 모두 같은 경우 성공 문구를 출력하고
					System.out.println("로그인 성공!\n");
					// break를 실행하여 for문 탈출
					// break;
					// ** return ** 은 메소드를 종료시킴으로써 이하의 어떠한 내용도 실행되지 않는다.
					return;
				}
			}
		}
		System.out.println("로그인 실패!\n");
		}
	}
	
	public static void main(String[] args) {
	    init(20);
	    addMember();
	   
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		menu(); 
		menuProc(in.nextInt(), in); 
		// outputMembers(); 
	    }	 
}
