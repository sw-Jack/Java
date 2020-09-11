package java10.Collection.Ex01;
import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		// ArrayList<저장할클래스명> 변수명 = new ArrayList<저장할클래스명>();
		ArrayList<String> lst = new ArrayList<String>();
		
		// add를 이용하여 ArrayList에 값 추가
		// 값 추가 시 인덱스에 순서대로(차례대로) 저장됨 (0 : test -> 1 : hello)
		lst.add("test");
		lst.add("hello");
		
		// get(index)를 이용하여 리스트 값을 불러옴
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));

	}
}
