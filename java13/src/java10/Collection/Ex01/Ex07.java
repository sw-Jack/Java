package java10.Collection.Ex01;
import java.util.ArrayList;
import java.util.List;

public class Ex07 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		lst.add("test"); 
		lst.add("hello");
		lst.add(2, "five"); 
		
		for(String data : lst) {
			System.out.println(data);
		}
		
		// ������ ��ġ(�ε���)�� �����͸� ����
		lst.remove(1);
		
		System.out.println("\n<after remove>");
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}
}
