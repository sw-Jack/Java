package java10.Collection.Ex01;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		
		// ArrayList�� List�� ���� �� �ϳ�
		// List��� interface�� ��ü�� �����Ͽ� ����� �� �ִ�.
		// List -> Interface / ArrayList -> Interface�� implements�ϴ� class (List > ArrayList)
		List<String> lst = new ArrayList<String>();
		
		lst.add("test");
		lst.add("hello");
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
	}
}
