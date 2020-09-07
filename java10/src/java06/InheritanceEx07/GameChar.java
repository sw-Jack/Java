package java06.InheritanceEx07;

public class GameChar {
	String [] facultyName; // 능력 이름 데이터
	int [] facultyData; // 능력 수치 데이터
	
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
		// 배열의 범위를 벗어난 idx가 들어오면 에러가 발생되므로
		if(this.facultyName.length > idx) {
		this.facultyName[idx] = name;
		this.facultyData[idx] = data;
		}
	}
}
