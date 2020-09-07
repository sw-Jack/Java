package java06.InheritanceEx07;
import java.util.Random;

/* 
 * �̸�
 * �����
 * ������
 * Ű
 * ���Ǹ�
 * ����
 */

public class PocketmonGo extends GameChar {
	private String name;
	
	// �����, ������, Ű�� �迭 ��ġ ������ 0, 1, 2��
	// ���ڸ� �����ϸ� ������(���� �б�)�� �������Ƿ�
	// �� ���ڿ� �̸��� �ο��� ��.
	final int HP = 0;
	final int WEIGHT = 1;
	final int HEIGHT = 2;
	// �����ڷ�, ȣ��� ���� ���� ����
	public PocketmonGo() {
		super(5);
		String [] ability = {"�����","������","Ű","���� ��","����"};
		int [] data = {35, 4, 28, 18854, 38};
		for(int i=0; i<ability.length;i++) {
			setFaculty(ability[i], data[i], i);
		}
	}
	
	public void showAbility() {
		String [] facultyName = getFacultyName();
		int [] facultyData = getFacultyData();
		
		for(int i=0;i<facultyName.length;i++)
		{
			System.out.println(facultyName[i] + "\t: " + facultyData[i]);
		}
	}
	
	// ��ȭ �޼ҵ�
	public void Buildup() {
		/* 
		 * ���������� ��ȭ ���μ��� ����
		 * ��ȭ ����
		 * - hp : �⺻���� 3��
		 * - ������ : �⺻���� 1.5��
		 * - Ű : �⺻���� 2�� 
		 */
		// getFacultyData() �޼ҵ带 ���� ĳ������ ��ġ �����͸� ����
		// ���� ���� ��ȭ ���μ����� �°� �ڵ�
		int [] intData = getFacultyData();
		intData[HP] *= 3;
		intData[WEIGHT] *= 1.5;
		intData[HEIGHT] *= 2;
	}
	
	// ��ȭ ����, ���� �Ǵ� �޼ҵ�
	// buildRate�� ��ȭ ���� Ȯ������ �ǹ�
	public void Buildup(int buildRate) {
		// ��ȭ �������� �����ϰ� ����
		Random random = new Random();
		int probability = random.nextInt(100);
		
		// �Էµ� ��ȭ������ ���� ��ȭ���� ������ ��ȭ �������� ����
		if(probability < buildRate)
		{
			System.out.println("\n*** ��ȭ ���� ***");
			Buildup();
			showAbility();
		}
		else 
		{
			System.out.println("\n*** ��ȭ ���� ***");
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


