package java08.Inheritance.Ex01;

/*
 * 추상화 클래스
 * abstract 라는 키워드를 이용하여 메소드를 만들면 
 * 코딩하지 않고 이름만 지정하여 사용할 수 있다.
 */

public abstract class Attack {
	public String StandOffAttack() {
		return "슝슝";
	}
	public abstract String MelleAttack();
}


