package java10.Collection.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		lst.add("test"); 
		lst.add("hello");
		lst.add(2, "five"); 
		
		// lst�� �ִ� String ��ü���� data�� �ϳ��� ����
		for(String data : lst) {
			System.out.println(data);
		}
	}
}
