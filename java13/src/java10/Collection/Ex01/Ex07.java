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
		
		// 지정된 위치(인덱스)의 데이터를 삭제
		lst.remove(1);
		
		System.out.println("\n<after remove>");
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}
}
