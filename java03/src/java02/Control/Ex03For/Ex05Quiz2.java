package java02.Control.Ex03For;
/* Quiz
 * 2. 다음의 조건에 맞도록 10개의 랜덤한 수를 출력하시오.
 * a. 수의 범위는 1~100으로 정한다.
 * b. 10개의 수를 무작위하게 나열하며 가장 큰수만 한번 더 출력
 * c. 10개의 수 중 가장 작은 값도 한번 더 출력
 */
public class Ex05Quiz2 {

	public static void main(String[] args) {
		int i;
		int max = 1;
		// 최소값을 구할 경우 최소값을 저장하기 위한 변수의 초기값은 
		// 사용되는 수들 중 최대값을 지정하면 된다.
		int min = 100;
		for (i=0;i<10;i++) {

			int randNum = (int)(Math.random() * 100) + 1;   // 1 ~ 100
			System.out.print(randNum + " ");
			if(max<randNum) {
				max = randNum;
			}
			if(min>randNum) {
				min = randNum;
			}
		}
		System.out.println("\n가장 큰 수 : " + max + "\n가장 작은 수 : " + min);
	}

}
