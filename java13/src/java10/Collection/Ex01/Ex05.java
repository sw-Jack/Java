package java10.Collection.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Ex05 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		lst.add("test"); 
		lst.add("hello");
		lst.add(2, "five"); 

		// size�� ArrayList�� ũ�⸦ ���´�.
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}
}
