package java06.InheritanceEx07;

public class GameMain {

	public static void main(String[] args) {
		PocketmonGo pg = new PocketmonGo();
		
		// 캐릭터의 원래 능력치 보여주는 메소드
		pg.showAbility();
	
		// 강화 성공, 실패 판단 메소드 실행
		// 입력 인자값(80)보다 랜덤 수가 작으면 강화 성공, 크면 강화 실패
		pg.Buildup(80);
	}
}
	
