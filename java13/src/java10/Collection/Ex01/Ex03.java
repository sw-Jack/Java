package java10.Collection.Ex01;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		// ArrayList�� List�� ���� �� �ϳ�
		// List��� interface�� ��ü�� �����Ͽ� ����� �� �ִ�.
		List<String> lst = new ArrayList<String>();
		
		lst.add("test"); 
		lst.add("hello");
		// ��ġ�� ������ �� �ִ� -> index 2�� "five" ����
		lst.add(2, "five"); 
		// ������ �Ѱܼ� �����͸� ������ �� ����.
		// lst.add(4, "five"); �� ����
		 
		// ������ �����͸� ������ �� �ִ�.
		lst.add(1, "tmp"); // ���� �� ���� ("hello" -> "tmp")
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2));
	}
}
