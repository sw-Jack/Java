package java04.app01.Membership;
import java.util.Scanner;
/* 문자열 비교 시  equals or equalsIgnoreCase
 *  equals : 대소문자 구분 -> 확실히 동일해야함
 *  equalsIgnoreCase : 대소문자 구분 X -> 문자만 같으면 됨
 */
public class Ex07 {
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
	
	public static void main(String[] args) {
	    init(20);
	    addMember();
	   
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("id를 입력하세요");
		String id = in.next();

		// 대소문자 구분한 비교
		if(ids[0].equals(id)) {
			System.out.println("비교 성공");
		}
	    
		// 대소문자 구분하지 않는 비교
		if(ids[0].equalsIgnoreCase(id))
		{
			System.out.println("비교 성공!!!!");
		}
		
		/* menu(); 
		 * menuProc(in.nextInt(), in); 
		 * outputMembers(); 
		 * */	 
	}
}
