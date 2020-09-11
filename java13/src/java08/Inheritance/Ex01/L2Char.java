package java08.Inheritance.Ex01;

public class L2Char extends Attack {
	// abstract 클래스를 상속받으면 구현되어 있지 않은 부분을 아래와 같이
	// @Override 라는 키워드로 구현하여 사용해야 한다.
	// 여기서 Override 라는 키워드는 Overriding을 의미하는 말로
	// 부모 클래스로부터 상속 받은 메소드를 '재정의'한다는 의미이다.
	@Override
	public String MelleAttack() {
		return "펑펑";
	}
}

