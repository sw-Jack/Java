package java08.Inheritance.Ex02;

// AttackImpl 클래스가 implements라는 키워드를 통해 Attack 인터페이스를 상속받음
public class AttackImpl implements Attack {

	// @Override 키워드를 통해 추상 클래스와 비슷하게 상위 인터페이스의 메소드 정의
	@Override
	public String StandoffAttack() {
		return "펑펑";
	}

	@Override
	public String MelleAttack() {
		return "슝슝";
	}
}
