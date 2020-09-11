package java10.Collection.Ex02;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		
		// Set은 List와 달리 순서 없이 랜덤한 자리에 값들이 저장됨
		Set<String> hs = new HashSet<String>();
		
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");

		// 리스트에서와는 달리 Set에서는 중복이 허락되지 않는다.
		// 중복 값은 무시된다.
		hs.add("two");
		
		for(String str : hs) {
			System.out.println(str);
		}
	
	}
}
