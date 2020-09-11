package java10.Collection.Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex09 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		String [] words = {"��", "����", "���", "����", "���³�"};
		Random random = new Random();
		
		// words�� �ִ� �ܾ���� �����ϰ� �����Ͽ� lst�� ����
		for(int i=0;i<words.length;i++) {
			int randIdx = random.nextInt(words.length);
			lst.add(words[randIdx]);
		}
		System.out.println("<Before Sorting>");
		for(String word : lst) {
			System.out.println(word);
		}
		System.out.println("\n<After Sorting>");
			
		// sort�� �̿��Ͽ� List�� �ִ� �����͸� ������ �� �ִ�.
		lst.sort(null);
		for(String word : lst) {
			System.out.println(word);
		}		
	}
}


