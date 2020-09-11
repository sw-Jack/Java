package java10.Collection.Ex02;

import java.util.TreeSet;
import java.util.Random;
import java.util.Set;

public class Ex05 {
	public static void main(String[] args) {
		// TreeSet : ���� �˻� Ʈ��
		Set<String> hs = new TreeSet<String>();
		String [] words = {"java", "microsoft", "chrome", "eclipse", "linux"};
		Random random = new Random();
		
		// �迭���� ���� ������ �������� ��
		for(int i=0;i<words.length;i++) {
			int idx = random.nextInt(words.length);
			System.out.println(words[idx]);
			hs.add(words[idx]);
		}
		
		// ���� �˻� Ʈ���� ��ġ�� �ߺ����� ����(�ϳ��� ����)�ǰ� ������ ���� ���·� ���
		System.out.println("==========");
		for(String word : hs) {
			System.out.println(word);
		}
	}
}

