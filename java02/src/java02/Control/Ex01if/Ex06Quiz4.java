package java02.Control.Ex01if;

import java.util.Scanner;
/* Quiz
 * 두 수를 입력받아 큰 수를 출력하시오.
 * 1. 두 수를 입력받는다.
 * 2. 첫번째 수와 두번째 수를 비교해서 첫번째 수가 크면 첫번째 수를 출력한다.
 * 3. 첫번째 수와 두번째 수를 비교해서 두번째 수가 크면 두번째 수를 출력한다.
 * 4. 첫번째 수와 두번째 수를 비교해서 같으면 첫번째를 출력한다.
 */

public class Ex06Quiz4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 최초에 입력된 수는 비교 대상이 없으므로 최대값으로 지정해놓고
		System.out.print("첫번째 수 입력 : ");
		int num1 = in.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = in.nextInt();

		System.out.print("큰 수 : ");
		int max;
		max = num1;
		// 들어오는 수들을 최초 최대값과 비교한다.
		if(max < num2) {
		max = num2;
		}
		else {
			max = max;
			}
		System.out.println(max);
	}

}
