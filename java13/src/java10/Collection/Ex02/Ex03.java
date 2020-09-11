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

		// Set���� �ε����� �����Ǿ� ���� �����Ƿ� ���� �����ϱ� ���ؼ� ���� ������ ���� �Է������ �Ѵ�.
		hs.remove("three");
		System.out.println("\n<After remove \"three\">");
		itrt = hs.iterator();
		while(itrt.hasNext()) {
			System.out.println(itrt.next());
		}
		
		// ��� ���� ���� �� �ִ� clear()
		hs.clear();
		System.out.println("\n<After remove all>");
		itrt = hs.iterator();
		while(itrt.hasNext()) {
			System.out.println(itrt.next());
		}
	}
}
