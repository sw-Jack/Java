package java04.app02.Authentication;
import java.util.Scanner;

/* Quiz
 * �Է��� ���� �ڸ��� ��ŭ�� ���� ������ ���� ���� �� �ֵ��� �ڵ��Ͻÿ�
 * ex) 
 * ���� �Է��ϼ��� : 4
 * 1 ~ 10000 ������ ������ ���� ��ȯ
 * random �޼ҵ� Ȱ��
 */


public class Ex02Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		// �ڸ��� �Է�
		int num = in.nextInt();	
		// getnum() �޼ҵ��� ��ȯ�� outputnum�� ���� ���� get
		int get = getnum(num);
		System.out.println("������ȣ : " + get);
	}

	// ������ ������ȣ ��� �޼ҵ�
	static int getnum(int n) {
		// ������ ������ȣ ����
		// �ڹ� ���� �޼ҵ� Math.random()��
		// �¼��� ���ϴ� �޼ҵ� Math.pow()�� �̿��ؼ� 0�̻� 10000�̸��� �� ����
		int outputnum = (int)(Math.random()*Math.pow(10,n));
		// ������ ������ȣ ��ȯ
		return outputnum;
	}
}
