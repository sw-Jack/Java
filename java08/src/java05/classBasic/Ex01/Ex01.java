package java05.classBasic.Ex01;

/* class는 비슷한 종류의 것들을 묶어 놓은 것이다.
 * 아래에서는 car라는 class를 생성한 것이며
 * car의 속성 중 색상, 휠 크기, 엔진을 구현한 것이다.
 * class의 이름 첫 글자는 대문자로 사용한다.
 * 
 */


// Car 클래스 생성
// 변수 선언 : Car의 속성 중 색상, 휠 크기, 엔진을 구현
class Car{
	String outColor;
	int wheelSize;
	int engine;
}

public class Ex01 {
	public static void main(String[] args) {
		// Car 클래스를 사용할 경우
		// [클래스이름] [객체이름] = new [클래스이름] ()
		// 위와 같은 형식으로 사용한다.
		Car car = new Car();
		
		// .(점)은 객체가 가지고 있는 내부 정보들로
		// car라는 객체의 내부에 아래와 같은 정보들이 존재하여 데이터를 저장한 것이다.
		car.outColor = "red";
		car.wheelSize = 17;
		car.engine = 5000;
		
		System.out.println(car);
		System.out.println(car.outColor);
		System.out.println(car.wheelSize);
		System.out.println(car.engine);
	}
}
