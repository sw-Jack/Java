package java10.Collection.Ex01;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		// ArrayList는 List의 종류 중 하나
		// List라는 interface로 객체를 생성하여 사용할 수 있다.
		List<String> lst = new ArrayList<String>();
		
		lst.add("test"); 
		lst.add("hello");
		// 위치를 지정할 수 있다 -> index 2에 "five" 저장
		lst.add(2, "five"); 
		// 순서를 넘겨서 데이터를 저장할 수 없다.
		// lst.add(4, "five"); 는 에러
		 
		// 기존의 데이터를 변경할 수 있다.
		lst.add(1, "tmp"); // 기존 값 수정 ("hello" -> "tmp")
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2));
	}
}
