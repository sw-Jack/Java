package java04.app01.Membership;

import java.util.Scanner;

public class Ex01Quiz01 {
	/* �޼ҵ�� ������� ������ �����ΰ� ������ ó���� �Ҷ� ����� ����� �� �ִ�.
	 * �޼ҵ�� �Ʒ��� ���� ������ ���´�.
	 * [��ȯ�ڷ���] [�޼ҵ��̸�]([�Էµ�����]...)
	 * ��ȯ �ڷ����� �Է� �����ʹ� ���� Ȯ���غ���
	 * 
	 * ���� main���� menu��� �޼ҵ带 ȣ���ϴµ� main�� static�̶�� Ű���尡 �ֱ� ������
	 * menu���� static�̶�� Ű���带 ���� �־�� �Ѵ�.
	 * 
	 * ������ ��� �� ��� �Լ��� ������ ����ϴ� �ͺ���
	 * �Ʒ� �ڵ�ó�� ����� ������ ���ڿ��� ������ ��
	 * �ѹ��� ����ϴ� ���� �� ȿ�����̴�.
	 */
	static void menu() {
		String menustr = "=================\n";
		menustr += "1.ȸ������\n";
		menustr += "2.�α���\n";
		menustr += "3.����\n";
		menustr += "=================\n";
		menustr += "�޴��� �����ϼ��� : ";
		System.out.println(menustr);
	}
	public static void main(String[] args) {	
		menu();
	}

}
