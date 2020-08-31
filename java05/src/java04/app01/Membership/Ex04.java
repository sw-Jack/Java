package java04.app01.Membership;

import java.util.Scanner;

public class Ex04 {
		static String [] names;
		static int idx;

	public static void main(String[] args) {
		names = new String[10];
		idx = 0;
		// idx를 1씩 증가시킴으로써 배열의 저장 위치를 변경하고
		// 0, 1번째에 각각 이름을 저장할 수 있다.
		names[idx++] = "Son Heung-min";		// name[0] = "Song Heung-min", idx = 1,
		names[idx++] = "Park ji-sung";		// name[1] = "Park Ji-sung", idx = 2
	
		for(int i=0;i<idx;i++)		// for(int i=0;i<2;i++)
		{
			System.out.println(names[i]);		// output -> name[0], name[1]
		}
	}
}
