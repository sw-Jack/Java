package java01.Basic;
import java.util.Scanner;

/*sysout ���� �ڵ� �ϼ��� ��Ű��
 * System.out.println�� �������
 */
public class Ex02Quiz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("����� �̸��� �Է��ϼ��� : ");
		String name = in.next();
		System.out.print(name);
		System.out.println("�� �ȳ��ϼ���");
		System.out.println("======");
		System.out.println(name + "�� �ȳ��ϼ���");

	}

}
