package java06.InheritanceEx06;

public class GameChar {
	private String [] facultyName; // �ɷ� �̸� ������
	private int [] facultyData; // �ɷ� ��ġ ������
	
	// Ŭ���� ���� �� �ɷ�ġ�� ������ �����ϱ� ���� ���
	public GameChar(int n) {
		facultyName = new String[n];
		facultyData = new int[n];
	}
	
	public String[] getFacultyName() {
		return facultyName;
	}
	
	public int[] getFacultyData() {
		return facultyData;
	}
	
	public void setFaculty(String name, int data, int idx) {
		// �迭�� ���� ���� idx�� ���� ���� �� ����
		if(this.facultyName.length > idx) {
		this.facultyName[idx] = name;
		this.facultyData[idx] = data;
		}
	}
}
