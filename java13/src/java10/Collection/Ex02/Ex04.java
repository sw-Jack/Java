package java10.Collection.Ex02;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		String [] words = {"java", "microsoft", "chrome", "eclipse", "linux"};
		Random random = new Random();
		
		// words �迭�� �ִ� ������ �������� hs�� ����
		for(int i=0;i<words.length;i++) {
			int idx = random.nextInt(words.length);
			System.out.println(words[idx]);
			hs.add(words[idx]);
		}
		
		// ���� ������ ���� �� �ߺ��� ���� ���� �� ���
		System.out.println("==========");
		for(String word : hs) {
			System.out.println(word);
		}
	}
}

