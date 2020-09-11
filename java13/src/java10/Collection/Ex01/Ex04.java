package java10.Collection.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		lst.add("test"); 
		lst.add("hello");
		lst.add(2, "five"); 
		
		// 지정된 위치의 데이터를 변경할 경우
		lst.set(1, "three");
		// 없는 데이터는 변경할 수 없다.
		//lst.set(3, "tmp"); -> 에러
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2));
	}
}
