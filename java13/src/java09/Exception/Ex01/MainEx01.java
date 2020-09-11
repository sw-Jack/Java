package java09.Exception.Ex01;

public class MainEx01 {
	public static void main(String [] args) {
	//ExceptionEx except = new ArithmeticEx01();
	//except = new ArithmeticEx02();
	//except = new ArithmeticEx03();

	//ExceptionEx except = new ArithmeticEx02();
	//except = new ArithmeticEx03();
	//except = new ArithmeticEx01();
	
	ExceptionEx except = new ArithmeticEx01();
	except = new ArithmeticEx03();
	except = new ArithmeticEx02();
	
	except.ExceptionCase();
	}
}
