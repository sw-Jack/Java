package java06.InheritanceEx07;

public class GameMain {

	public static void main(String[] args) {
		PocketmonGo pg = new PocketmonGo();
		
		// ĳ������ ���� �ɷ�ġ �����ִ� �޼ҵ�
		pg.showAbility();
	
		// ��ȭ ����, ���� �Ǵ� �޼ҵ� ����
		// �Է� ���ڰ�(80)���� ���� ���� ������ ��ȭ ����, ũ�� ��ȭ ����
		pg.Buildup(80);
	}
}
	
