package java09.Exception.Ex01;
import java.util.Random;


// 인터페이스 ExceptionEx를 상속받은(implements) ArithmeticEx01 클래스
public class ArithmeticEx01 implements ExceptionEx {
	// 메소드 재정의
	@Override
	public void ExceptionCase() {
		// 랜덤 객체 생성
		Random random = new Random();
		//
		for(int i=0;i<10;i++) {
			// 0 ~ 9 사이의 랜덤 수로 100을 나눈다(10번 진행)
			System.out.println(100/random.nextInt(10));
		}
	}
}
