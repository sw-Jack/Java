package java09.Exception.Ex01;
import java.util.Random;

//인터페이스 ExceptionEx를 상속받은(implements) ArithmeticEx02 클래스
public class ArithmeticEx02 implements ExceptionEx {

	@Override
	public void ExceptionCase() {
		Random random = new Random();
		
		for(int i=0;i<10;i++) {
			try { // 예외가 발생할 만한 코드를 이곳에 넣는다.
			System.out.println(100/random.nextInt(10));
			} 
			catch(ArithmeticException e) {
				// try안의 구문에 예외가 발생되면 이곳에서 해결
				// 아래 코드는 예외가 발생되었을 경우 에러 문구 출력
				// e.printStackTrace();
				
				// 예외 발생하는 경우에는 "0"을 출력
				System.out.println("0");
			}
		}
	}
}
