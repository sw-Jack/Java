package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		System.out.print("�湮 Ƚ���� �Է��ϼ��� : ");
		int visitCnt = in.nextInt();
		
		// String�� ���ڿ��� ������ �� �ִ� type�̸� 
		// �ʱⰪ�� null�� �ָ� ��ü�� ����ִٴ� �ǹ��̴�.
		// null�� �ƴ� "�� "�� �ʱⰪ���� �ְ� �Ǹ�
		// else���� ����� �ʿ䰡 ���� �ȴ�.
		// �⺻���� "�� "�̸� visitCnt�� 0�� ��츸 
		// "ù "�̶�� ���ڿ��� �����ϸ� ù �湮�� �� �湮�� ������ �� �ִ�.
		// String visitStr = null;
		String visitStr = "��";
		
		if(visitCnt<1) {
			visitStr = "ù ";
		}
		
		/*
		 * else { visitStr = "�� "; }
		 */		
		System.out.println(visitStr + "�湮 �����մϴ�.");


	}

}
