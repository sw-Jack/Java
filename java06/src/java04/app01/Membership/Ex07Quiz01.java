package java04.app01.Membership;
import java.util.Scanner;
/* Quiz
 * �α��� ����
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
		menustr += "1.ȸ������\n";
		menustr += "2.�α���\n";
		menustr += "3.����\n";
		menustr += "=================\n";
		menustr += "�޴��� �����ϼ��� : ";
		System.out.print(menustr);
	}
	
	static void menuProc(int n, Scanner in) {
		switch(n) {
		case 1 :
			System.out.println("\n<ȸ������>"); 
			membership(in);
			break;
		case 2 :
			System.out.println("\n<�α���>"); 
			loginProc(in);
			break;
		case 3 :
			System.out.println("\n<����>"); break;
		default : 
			System.out.println("�߸��� ��ȣ�Դϴ�"); 
		}
	}
	
	static void membership(Scanner in) {
		System.out.print("�̸� �Է� : ");
		names[idx] = in.next();
		System.out.print("���̵� �Է� : ");
		ids[idx] = in.next();
		System.out.print("�н����� �Է� : ");
		pws[idx] = in.next();
		idx++;
		System.out.println("ȸ������ ���ϵ帳�ϴ�!");
	}		
	
	static void addMember() {
		names[idx] = "�����";
		ids[idx] = "jaewoo";
		pws[idx++] = "1111";
		
		names[idx] = "ȫ�浿";
		ids[idx] = "gildong";
		pws[idx++] = "2222";
	}

	static void outputMembers() {
		System.out.println("\n\n�̸�\t���̵�\t\t�н�����");
		for(int i=0;i<idx;i++)
		{
			System.out.println(names[i] + "\t" + ids[i] + "\t\t" + pws[i]);

		}
	}
	
	static void loginProc(Scanner in) {
		while(true) {
		// id�� pw �Է¹ޱ�
		System.out.print("���̵� �Է� : ");
		String id = in.next();
		System.out.print("�н����� �Է� : ");
		String pw = in.next();
		// �迭�� 0���� �����ϹǷ� 0������ ȸ�� ������ �ִ밪�� idx���� �ݺ�
		for(int i=0;i<idx;i++) {
			// id�� ������ ��
			if(ids[i].equals(id)) {
				// pw�� ������ ��
				if(pws[i].equals(pw)) {
					// id�� pw�� ��� ���� ��� ���� ������ ����ϰ�
					System.out.println("�α��� ����!\n");
					// break�� �����Ͽ� for�� Ż��
					// break;
					// ** return ** �� �޼ҵ带 �����Ŵ���ν� ������ ��� ���뵵 ������� �ʴ´�.
					return;
				}
			}
		}
		System.out.println("�α��� ����!\n");
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
