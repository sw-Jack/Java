package java06.InheritanceEx06;

public class GameChar {
	private String [] facultyName; // �ɷ� �̸� ������
	private int [] facultyData; // �ɷ� ��ġ ������
	
	// ���ڰ� �ϳ��� ������ : �Ű������� ���� �迭�� ũ�� ����
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
	
	// setter�� �ѹ��� �޾� �޾ƿ��� ������ ���� �ε����� �°� ����
	public void setFaculty(String name, int data, int idx) {
		this.facultyName[idx] = name;
		this.facultyData[idx] = data;
	}
}
