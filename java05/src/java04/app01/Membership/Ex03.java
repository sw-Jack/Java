package java04.app01.Membership;

import java.util.Scanner;

public class Ex03 {
	// 클래스 내의 변수를 멤버 변수라고 한다.
	// 문자열을 저장하는 names라는 변수를 배열 변수로 정의하고
	// 숫자를 저장하기 위해 정수형 변수인 idx를 선언한다.
	// names에는 이름이 저장되며 이름이 저장되면 idx를 1씩 증가시켜
	// 배열의 위치를 변경해준다.
		static String [] names;
		static int idx;

	public static void main(String[] args) {
		// 이름을 저장할 문자열 공간 10개 생성
		names = new String[10];
		
		// 배열의 시작값이 0이므로 0으로 초기화
		idx = 0;
		// 현재 idx가 0이기 때문에 names[0]에 값을 저장하게 되며
		// idx의 변화가 없으므로 결국
 		// names[idx] = "Lee jae-woo";
		// names[idx] = "Hong gil-dong";
		// 위와 같이 실행되어 0번째에 이름이 저장된다.
		names[idx] = "Son Heung-min";
		names[idx] = "Park ji-sung";
		// 현재 i는 0이고 idx도 0이므로 "0 < 0"은 거짓이 되고
		// 결국 반복문은 한번도 실행되지 않는다.
		for(int i=0;i<idx;i++)
		{
			System.out.println(names[i]);
		}
		// names[0]의 값을 확인하기 위해 직접 입력하여 결과를 확인한다.
		System.out.println(names[0]);
	}
}
