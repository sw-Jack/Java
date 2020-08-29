package java02.Control.Ex03For;
/* Quiz
 * 3. 다음의 조건에 맞도록 2개의 랜덤한 수를 출력하시오.
 * a. 작은 값부터 큰 값 순으로 출력하시오.
 * b. 수의 범위는 1 ~ 10으로 정하시오.
 */
public class Ex05Quiz3 {

	public static void main(String[] args) {
		int min = (int)(Math.random() * 10) + 1;
		int max = (int)(Math.random() * 10) + 1;
		int tmp= 0;
		if(max<min) {
			tmp = min;
			min = max;
			max = tmp;
		}
		System.out.print(min + " " + max);	
	}
}
