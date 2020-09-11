package java10.Collection.Ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		Iterator<String> itrt;
		
		hs.add("first");
		hs.add("second");
		hs.add("third");
		
		itrt = hs.iterator();
		while(itrt.hasNext()) {
			System.out.println(itrt.next());
		}
	}
}
