package java10.Collection.Ex01;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.ReverbType;

/*
 * ArrayList는 데이터 검색이 빈번한 경우에 유용하며,
 * LinkedList는 데이터의 삽입 삭제가 빈번한 경우 유용하다.
 */

public class Ex10 {
	public static void main(String[] args) {
		List<String> lst = new LinkedList<String>();
		String [] words = {"꿈", "나무", "어린이", "좋아", "쉬는날"};
		Random random = new Random();
		
		for(int i=0;i<words.length;i++) {
			int randIdx = random.nextInt(words.length);
			lst.add(words[randIdx]);
		}
		System.out.println("<Before Sorting>");
		for(String word : lst) {
			System.out.println(word);
		}
		System.out.println("\n<After Sorting>");
		lst.sort(null);
		for(String word : lst) {
			System.out.println(word);
		}		
	}
}