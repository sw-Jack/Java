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
		
		// isEmpty()�� ��ü�� �ִ� ��� false�� , ���� ��쿣 true�� ��ȯ
		// clear�� ��ü ��ü�� �����.
		System.out.println("\n<before clear>");
		System.out.println("* is the List Empty? : " + lst.isEmpty());
		
		System.out.println("\n<after clear>");
		// ��� ������ ����
		lst.clear();
		System.out.println("* is the List Empty? : " + lst.isEmpty());
		
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}
}


