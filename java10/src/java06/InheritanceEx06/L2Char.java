package java06.InheritanceEx06;

/* ĳ���� �̸�
 * ����
 * �ɷ�ġ
 * - ����
 * - ���ݷ�
 * - ����
 * - ������
 */

// L2Char Ŭ������ GameChar Ŭ������ ���
public class L2Char extends GameChar {
	private String name;
	private String race;
	// L2Char ��ü ������ �����ڴ� �ڵ����� ����ǹǷ� ������ �ȿ� �ɷ�ġ ������ ��ġ �ʱ�ȭ
	public L2Char() {
		// super�� �θ� Ŭ�����κ��� ��ӹ��� ���� �ǹ��ϸ� ���⼭�� GameChar�� �ȴ�.
		// ��, GameChar(4)�� ���۵Ǿ� 4���� �ɷ�ġ�� ������ �� �ִ� ������ �����Ѵ�.
		// 4���� �ɷ� ����
		super(4);
		int idx = 0;
		// �ɷ��� �̸��� �ϳ��� �����ϱ� ���� �迭�� 4���� ������ �����ߴ�.
		String [] ability = {"����","���ݷ�","����","������"};
		
		// ���� �迭 ������ �ϳ��� �����ϱ� ���� �ݺ����� ���� ���̴�.
		// setFaculty�� ���۵Ǹ鼭 ���� : 1, ���ݷ� : 1, ���� : 1, ������ : 1 �� ����ȴ�.
		for(String name : ability) {
			setFaculty(name, 1, idx++);
		}
	}

	// �����ڿ��� ����� �ɷ� �̸��� ��ġ�� ���� �迭�� ����
	// facultyName[] = {"����","���ݷ�","����","������}
	// [] facultyData = {1, 1, 1, 1}
	public void showAbility() {
		String [] showFName = getFacultyName();
		int [] showFData = getFacultyData();
		
		System.out.println("* �ɷ�ġ");
		// ���� ����� ������ �ϳ��� ȭ�鿡 ���
		for(int i=0;i<showFName.length;i++)
		{
			System.out.println("- " + showFName[i] + " : " + showFData[i]);
		}
	}
	
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
