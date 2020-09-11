package java10.Collection.Ex01;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		
		// ArrayList는 List의 종류 중 하나
		// List라는 interface로 객체를 생성하여 사용할 수 있다.
		// List -> Interface / ArrayList -> Interface를 implements하는 class (List > ArrayList)
		List<String> lst = new ArrayList<String>();
		
		lst.add("test");
		lst.add("hello");
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
	}
}
