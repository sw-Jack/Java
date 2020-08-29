package java02.Control.Ex03For;
/* Quiz
 * 1. 다음의 조건에 맞도록 10개의 랜덤한 수를 출력하시오.
 * a. 수의 범위는 1~100으로 정한다.
 * b. 10개의 수를 무작위하게 나열하며 가장 큰수만 한번 더 출력
 */
public class Ex05Quiz1 {

	public static void main(String[] args) {
		int i;
		// 최대값을 구할 경우 최대값을 저장하기 위한 변수의 초기값은 
		// 사용되는 수들 중 최소값을 지정하면 된다.
		int max = 1;
		for (i=0;i<10;i++) {
			// random 함수를 이용할 경우 다음과 같이 공식을 만들어 사용할 수 있다.
			// Math.random()*범위+초기값
			// 범위는 0부터 입력한 수보다 1작을 때까지를 의미한다.
			// 초기값은 0이 아닌 시작값을 의미한다.
			// 1~100 사이의 값을 구하라는 내용에서 총 100개의 수를 사용하므로
			// 범위는 100이 되며 시작값이 1이므로 초기값이 1이 된다.
			// 만약 10 ~ 20 사이의 random값이면, 총 11개, 시작값 10으로
			//  (Math.random()*11)+10 으로 표현할 수 있다.
			int randNum = (int)(Math.random() * 100) + 1;   // 1 ~ 100
			System.out.print(randNum + " ");
			if(max<randNum) {
				max = randNum;
			}
		}
		System.out.println("\n가장 큰 수 : " + max);
	}

}













