package java10.Collection.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		lst.add("test"); 
		lst.add("hello");
		lst.add(2, "five"); 
		
		// ������ ��ġ�� �����͸� ������ ���
		lst.set(1, "three");
		// ���� �����ʹ� ������ �� ����.
		//lst.set(3, "tmp"); -> ����
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2));
	}
}
