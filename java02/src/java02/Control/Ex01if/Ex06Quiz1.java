package java02.Control.Ex01if;

import java.util.Scanner;
/* Quiz
 * 두 수를 입력받아 큰 수를 출력하시오.
 * 1. 두 수를 입력받는다.
 * 2. 첫번째 수와 두번째 수를 비교해서 첫번째 수가 크면 첫번째 수를 출력한다.
 * 3. 첫번째 수와 두번째 수를 비교해서 두번째 수가 크면 두번째 수를 출력한다.
 * 4. 첫번째 수와 두번째 수를 비교해서 같으면 첫번째를 출력한다.
 */

public class Ex06Quiz1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = in.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = in.nextInt();
		if(num1 > num2) {
			System.out.println("큰 수 : " + num1);
		}
		if(num1 < num2) {
			System.out.println("큰 수 : " + num2);
		}
		if(num1 == num2) {
			System.out.println("큰 수 : " + num1);
		}
	}

}
