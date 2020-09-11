package java10.Collection.Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex09 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		String [] words = {"꿈", "나무", "어린이", "좋아", "쉬는날"};
		Random random = new Random();
		
		// words에 있는 단어들을 랜덤하게 선별하여 lst에 저장
		for(int i=0;i<words.length;i++) {
			int randIdx = random.nextInt(words.length);
			lst.add(words[randIdx]);
		}
		System.out.println("<Before Sorting>");
		for(String word : lst) {
			System.out.println(word);
		}
		System.out.println("\n<After Sorting>");
			
		// sort를 이용하여 List에 있는 데이터를 정렬할 수 있다.
		lst.sort(null);
		for(String word : lst) {
			System.out.println(word);
		}		
	}
}


