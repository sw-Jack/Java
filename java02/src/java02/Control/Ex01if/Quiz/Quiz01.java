package java02.Control.Ex01if.Quiz;

import java.util.Scanner;
/* Quiz
 * 세 수를 입력받아 큰 수를 출력하시오.
 * 알고리즘 1
 * 최초의 수를 최대값에 저장한 후, 이후 들어오는 수를 최대값과 비교하고
 * 최대값보다 큰 수가 들어오면 최대값에 큰 수를 저장한다.
 */

public class Quiz01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("첫번째 수 입력 : ");
		int max = in.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = in.nextInt();
		System.out.print("세번째 수 입력 : ");
		int num3 = in.nextInt();
		
		if(max<num2) {
			max = num2;
		}
		if(max<num3) {
			max = num3;
		}
		System.out.print("큰 수 : " + max);


	}

}
