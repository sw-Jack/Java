package java04.app01.Membership;

import java.util.Scanner;

public class Ex04 {
		static String [] names;
		static int idx;

	public static void main(String[] args) {
		names = new String[10];
		idx = 0;
		// idx�� 1�� ������Ŵ���ν� �迭�� ���� ��ġ�� �����ϰ�
		// 0, 1��°�� ���� �̸��� ������ �� �ִ�.
		names[idx++] = "Son Heung-min";		// name[0] = "Song Heung-min", idx = 1,
		names[idx++] = "Park ji-sung";		// name[1] = "Park Ji-sung", idx = 2
	
		for(int i=0;i<idx;i++)		// for(int i=0;i<2;i++)
		{
			System.out.println(names[i]);		// output -> name[0], name[1]
		}
	}
}
