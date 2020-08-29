import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// final은 상수에 의미를 부여하기 위해 문자열로 표현하는 것이다.
		// 50이라는 수는 의미가 없지만 50을 MAXEFFECTIVERANGE로 표현하면
		// 최대 유효 사거리로 이해할 수 있으므로 코드의 가독성(읽기 쉬운 것)을 높일 수 있다.
		final int MAXEFFECTIVERANGE = 50;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("거리 입력 : ");
		int distance = in.nextInt();
		String output;

		// 만약에 distance(거리)가 MAXEFFECTIVERANGE(최대 유효 사거리)보다 크면
		// 즉, 멀리 있으면 
		if(distance > MAXEFFECTIVERANGE) {
			output = "보다 " + (distance - MAXEFFECTIVERANGE) + "m 멀리 있어요";
		}
		// 그렇지 않고(else) 만약에(if) 거리가 최대 유효 사거리보다 작으면 
		// 즉, 가까우면
		else if(distance < MAXEFFECTIVERANGE) {
			output = "보다 " + (MAXEFFECTIVERANGE - distance) + "m 가까이 있어요";
		}
		// 위의 모든 내용이 아니면(else) 즉, 같으면
		else {
			output = "와 정확히 일치해요";
		}
		System.out.println("최대 유효 사거리" + output);
		
		

	}

}
