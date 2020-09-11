package java10.Collection.Ex02;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		Iterator<String> itrt;
		
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		
		System.out.println("<Before remove>");
		itrt = hs.iterator();
		while(itrt.hasNext()) {
			System.out.println(itrt.next());
		}

		// Set에서 인덱스가 지정되어 있지 않으므로 값을 삭제하기 위해선 직접 삭제할 값을 입력해줘야 한다.
		hs.remove("three");
		System.out.println("\n<After remove \"three\">");
		itrt = hs.iterator();
		while(itrt.hasNext()) {
			System.out.println(itrt.next());
		}
		
		// 모든 값을 지울 수 있는 clear()
		hs.clear();
		System.out.println("\n<After remove all>");
		itrt = hs.iterator();
		while(itrt.hasNext()) {
			System.out.println(itrt.next());
		}
	}
}
