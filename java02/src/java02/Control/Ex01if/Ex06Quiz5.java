package java02.Control.Ex01if;

import java.util.Scanner;
/* Quiz
 * 두 수를 입력받아 큰 수를 출력하시오.
 * 1. 두 수를 입력받는다.
 * 2. 첫번째 수와 두번째 수를 비교해서 첫번째 수가 크면 첫번째 수를 출력한다.
 * 3. 첫번째 수와 두번째 수를 비교해서 두번째 수가 크면 두번째 수를 출력한다.
 * 4. 첫번째 수와 두번째 수를 비교해서 같으면 첫번째를 출력한다.
 */

public class Ex06Quiz5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 최초에 입력된 수는 비교 대상이 없으므로 최대값으로 지정해놓고
		System.out.print("첫번째 수 입력 : ");
		int max = in.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num = in.nextInt();

		System.out.print("큰 수 : ");
		
		// 두번째 입력된 수가 max보다 크다면 max에 두번째 입력된 수를 저장한다.
		if(max < num) {
		max = num;
		}
		// else는 max에 max를 저장하는 것으로 의미가 없기 때문에 생략한다.
//		else {max = max;}
		System.out.println(max);
	}

}
