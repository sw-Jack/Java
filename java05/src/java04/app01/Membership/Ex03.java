package java04.app01.Membership;

import java.util.Scanner;

public class Ex03 {
	// Ŭ���� ���� ������ ��� ������� �Ѵ�.
	// ���ڿ��� �����ϴ� names��� ������ �迭 ������ �����ϰ�
	// ���ڸ� �����ϱ� ���� ������ ������ idx�� �����Ѵ�.
	// names���� �̸��� ����Ǹ� �̸��� ����Ǹ� idx�� 1�� ��������
	// �迭�� ��ġ�� �������ش�.
		static String [] names;
		static int idx;

	public static void main(String[] args) {
		// �̸��� ������ ���ڿ� ���� 10�� ����
		names = new String[10];
		
		// �迭�� ���۰��� 0�̹Ƿ� 0���� �ʱ�ȭ
		idx = 0;
		// ���� idx�� 0�̱� ������ names[0]�� ���� �����ϰ� �Ǹ�
		// idx�� ��ȭ�� �����Ƿ� �ᱹ
 		// names[idx] = "Lee jae-woo";
		// names[idx] = "Hong gil-dong";
		// ���� ���� ����Ǿ� 0��°�� �̸��� ����ȴ�.
		names[idx] = "Son Heung-min";
		names[idx] = "Park ji-sung";
		// ���� i�� 0�̰� idx�� 0�̹Ƿ� "0 < 0"�� ������ �ǰ�
		// �ᱹ �ݺ����� �ѹ��� ������� �ʴ´�.
		for(int i=0;i<idx;i++)
		{
			System.out.println(names[i]);
		}
		// names[0]�� ���� Ȯ���ϱ� ���� ���� �Է��Ͽ� ����� Ȯ���Ѵ�.
		System.out.println(names[0]);
	}
}
