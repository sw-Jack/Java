package java04.app01.Membership;
import java.util.Scanner;
/* ���ڿ� �� �� equals ���
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
			System.out.println("ȸ������ ����"); 
			membership(in);
			break;
		case 2 :
			System.out.println("�α��� ����"); break;
		case 3 :
			System.out.println("���� ����"); break;
		default : 
			System.out.println("�߸��� ��ȣ�Դϴ�"); 
		}
	}
	
	static void membership(Scanner in) {
		System.out.print("�̸� �Է� : ");	// (idx = 2) ���� ����
		names[idx] = in.next();
		System.out.print("���̵� �Է� : ");
		ids[idx] = in.next();
		System.out.print("�н����� �Է� : ");
		pws[idx] = in.next();
		idx++;
		System.out.println("ȸ������ ���ϵ帳�ϴ�!");
	}
	
	static void addMember() {
		names[idx] = "�����";	// idx = 0
		ids[idx] = "jaewoo";
		pws[idx++] = "1111";	// idx = 1
		
		names[idx] = "ȫ�浿";	// idx = 1 
		ids[idx] = "gildong"; 
		pws[idx++] = "2222";	// idx = 2
	}

	static void outputMembers() {
		System.out.println("\n\n�̸�\t���̵�\t\t�н�����");
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
		
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		
		// ���ڿ� �񱳽� �Ʒ� ������ ���ڿ��� ��ġ�� ���ϴ� ������
		// names[0]�� �Էµ� ���ڿ��� ��ġ�� name�� �Էµ� ���ڿ��� ��ġ��
		// ���� �ٸ��� ������ �Ʒ��� ������ ����� ���� �ʴ´�.
		// ���ص��� ������ ������
		if(names[0] == name) {
			System.out.println("Ʋ�� ���ڿ� �� �޼ҵ�");
		}
		// ���ڿ� �� �� equals ��� �޼ҵ带 ����Ѵ�.
		// ���� ���� ������ �Ʒ� ������ "���ڿ� �� �޼ҵ��̴�" ��� �ܿ��
		if(names[0].equals(name))
		{
			System.out.println("�ùٸ� ���ڿ� �� �޼ҵ�");
		}
		
		/* menu(); 
		 * menuProc(in.nextInt(), in); 
		 * outputMembers(); 
		 * */	 
	}
}
