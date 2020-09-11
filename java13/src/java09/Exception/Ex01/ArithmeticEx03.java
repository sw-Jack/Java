package java09.Exception.Ex01;
import java.util.Random;

//인터페이스 ExceptionEx를 상속받은(implements) ArithmeticEx03 클래스
public class ArithmeticEx03 implements ExceptionEx {

	@Override
	public void ExceptionCase() {
		Random random = new Random();
		int result = 0;
		for(int i=0;i<10;i++) {
			try { // 예외 발생 코드
				result = 100/random.nextInt(10);
			} 
			catch(ArithmeticException e) {
				// 산술 예외
				result = 0;
			}
			catch(Exception e) {
				// 모든 예외
				e.printStackTrace();
			}
			finally { // 예외 관계 없이 무조건 실행
				System.out.println(result);
			}
		}
	}
}
