package java10.Collection.Ex02;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		
		// Set�� List�� �޸� ���� ���� ������ �ڸ��� ������ �����
		Set<String> hs = new HashSet<String>();
		
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");

		// ����Ʈ�����ʹ� �޸� Set������ �ߺ��� ������� �ʴ´�.
		// �ߺ� ���� ���õȴ�.
		hs.add("two");
		
		for(String str : hs) {
			System.out.println(str);
		}
	
	}
}
