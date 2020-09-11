package java10.Collection.Ex02;

import java.util.TreeSet;
import java.util.Random;
import java.util.Set;

public class Ex05 {
	public static void main(String[] args) {
		// TreeSet : 이진 검색 트리
		Set<String> hs = new TreeSet<String>();
		String [] words = {"java", "microsoft", "chrome", "eclipse", "linux"};
		Random random = new Random();
		
		// 배열에는 랜덤 값들이 무작위로 들어감
		for(int i=0;i<words.length;i++) {
			int idx = random.nextInt(words.length);
			System.out.println(words[idx]);
			hs.add(words[idx]);
		}
		
		// 이진 검색 트리를 거치면 중복값은 제거(하나만 남음)되고 순서가 잡힌 상태로 출력
		System.out.println("==========");
		for(String word : hs) {
			System.out.println(word);
		}
	}
}

