package java06.InheritanceEx06;

public class GameChar {
	private String [] facultyName; // 능력 이름 데이터
	private int [] facultyData; // 능력 수치 데이터
	
	// 클래스 생성 시 능력치의 갯수를 지정하기 위해 사용
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
		// 배열의 범위 내의 idx가 들어올 떄만 값 저장
		if(this.facultyName.length > idx) {
		this.facultyName[idx] = name;
		this.facultyData[idx] = data;
		}
	}
}
