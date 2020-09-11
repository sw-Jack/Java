package java10.Collection.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		lst.add("test"); 
		lst.add("hello");
		lst.add(2, "five"); 
		
		// lst에 있는 String 객체들을 data에 하나씩 전달
		for(String data : lst) {
			System.out.println(data);
		}
	}
}
