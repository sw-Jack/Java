package java06.InheritanceEx06;

public class GameMain {
	public static void main(String[] args) {
		// GameChar Ŭ������ ��ü ���ڷ� 3�� �����Ͽ� 
		// facultyName��  facultyData �迭�� ũ�Ⱑ 3���� ������
		GameChar gc = new GameChar(3);
		
		// setter�� �̿��� �� �ε����� �� ����
		gc.setFaculty("��", 80, 0);
		gc.setFaculty("��ø", 20, 1);
		gc.setFaculty("����", 40, 2);

		// ****** ��� �� �� ���̴� for�� ���� ******** �� �˾Ƶα� 
		// FacultyName(ĳ���� �ɷ�)�� ����Ǿ� �ִ� ������ �ҷ���
		// name�̶�� ������ �ϳ��� �ְ� ���
		for(String name:gc.getFacultyName()) {
			System.out.print(name + "\t");
		}
		
		System.out.println();
		
		// FacultyData(ĳ���� �ɷ�ġ)�� ����Ǿ� �ִ� ������ �ҷ���
		// data��� ������ �ϳ��� �ְ� ���
		for(int data:gc.getFacultyData()) {
			System.out.print(data + "\t");
		}
	}
}
