 package java10.Collection.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Ex08 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		lst.add("test"); 
		lst.add("hello");
		lst.add(2, "five"); 
		
		for(String data : lst) {
			System.out.println(data);
		}
		
		// isEmpty()는 객체가 있는 경우 false를 , 없는 경우엔 true를 반환
		// clear는 객체 전체를 지운다.
		System.out.println("\n<before clear>");
		System.out.println("* is the List Empty? : " + lst.isEmpty());
		
		System.out.println("\n<after clear>");
		// 모든 데이터 삭제
		lst.clear();
		System.out.println("* is the List Empty? : " + lst.isEmpty());
		
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}
}


