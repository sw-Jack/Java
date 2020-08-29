package java02.Control.Ex02Switch;

public class Ex01 {

	public static void main(String[] args) {
		// Math는 수학 관련 클래스이며 내부에 있는 random 메소드는 
		// 임의의(무작위) double형 데이터를 반환(돌려줌)한다.
		// 거기에 100 곱한후 (int)를 이용하여 정수형으로 자료형을 변경해준다.
		int randNum = (int)(Math.random() * 100);
		
		System.out.println(randNum + "점");
		System.out.print("학점 : ");
		
		// switch의 괄호 안에는 정수값만 들어가야 하며 randNum / 10은 2자리 수에서
		// 앞자리의 수만 사용하겠다는 의미이다. 
		// 90점대 , 80점대 형식으로 앞의 9, 8이라는 값을 얻기 위해 만든 수식이다.
		// case는 특정 형태를 의미하는 것으로 case 9하면 switch의 결과가 9인 값을 의미하며 
		// if(randNum/10 == 9)와 같은 의미이다.
		// break는 switch 명령어를 빠져나오기 위한 명령어이다.
		
		switch(randNum / 10) {
		case 9 : System.out.println("A"); break;
		case 8 : System.out.println("B"); break;
		case 7 : System.out.println("C"); break;
		case 6 : System.out.println("D"); break;
		default : System.out.println("F"); break;
		}
	}

}
