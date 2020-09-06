package java06.InheritanceEx06;

public class GameMain {
	public static void main(String[] args) {
		// GameChar 클래스의 객체 인자로 3을 지정하여 
		// facultyName과  facultyData 배열의 크기가 3으로 지정됨
		GameChar gc = new GameChar(3);
		
		// setter를 이용해 각 인덱스에 값 저장
		gc.setFaculty("힘", 80, 0);
		gc.setFaculty("민첩", 20, 1);
		gc.setFaculty("지능", 40, 2);

		// ****** 출력 시 잘 쓰이는 for문 형태 ******** 잘 알아두기 
		// FacultyName(캐릭터 능력)에 저장되어 있는 값들을 불러와
		// name이라는 변수에 하나씩 넣고 출력
		for(String name:gc.getFacultyName()) {
			System.out.print(name + "\t");
		}
		
		System.out.println();
		
		// FacultyData(캐릭터 능력치)에 저장되어 있는 값들을 불러와
		// data라는 변수에 하나씩 넣고 출력
		for(int data:gc.getFacultyData()) {
			System.out.print(data + "\t");
		}
	}
}
