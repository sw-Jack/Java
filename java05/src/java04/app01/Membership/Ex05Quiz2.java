package java04.app01.Membership;

import java.util.Scanner;
/* Quiz
 * 회원가입을 통해 신규 회원을 등록하고
 * 지금까지 등록된 모든 회원 정보를 출력하는 메소드를 만드시오.
 */

public class Ex05Quiz2 {
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
	
	static void outputMembers() {
		System.out.println("\n\n이름\t\t아이디\t\t패스워드");
		for(int i=0;i<idx;i++)
		{
			System.out.println(names[i] + "\t\t" + ids[i] + "\t\t" + pws[i]);

		}	
	}
	
	public static void main(String[] args) {
	    init(20);
	    
	    while(true)
	    {
	    	@SuppressWarnings("resource")
		    Scanner in = new Scanner(System.in);
		    menu();
		    menuProc(in.nextInt(), in);
		    outputMembers();
	    }
	}
}
