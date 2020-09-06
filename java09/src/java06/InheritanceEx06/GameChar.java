package java06.InheritanceEx06;

public class GameChar {
	private String [] facultyName; // 능력 이름 데이터
	private int [] facultyData; // 능력 수치 데이터
	
	// 인자가 하나인 생성자 : 매개변수를 통해 배열의 크기 지정
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
	
	// setter를 한번에 받아 받아오는 값들을 지정 인덱스에 맞게 저장
	public void setFaculty(String name, int data, int idx) {
		this.facultyName[idx] = name;
		this.facultyData[idx] = data;
	}
}
