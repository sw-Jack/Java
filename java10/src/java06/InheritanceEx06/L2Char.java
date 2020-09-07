package java06.InheritanceEx06;

/* 캐릭터 이름
 * 종족
 * 능력치
 * - 레벨
 * - 공격력
 * - 방어력
 * - 마법력
 */

// L2Char 클래스는 GameChar 클래스를 상속
public class L2Char extends GameChar {
	private String name;
	private String race;
	// L2Char 객체 생성시 생성자는 자동으로 실행되므로 생성자 안에 능력치 종류와 수치 초기화
	public L2Char() {
		// super는 부모 클래스로부터 상속받은 것을 의미하며 여기서는 GameChar가 된다.
		// 즉, GameChar(4)가 동작되어 4개의 능력치를 저장할 수 있는 공간을 생성한다.
		// 4가지 능력 설정
		super(4);
		int idx = 0;
		// 능력의 이름을 하나씩 저장하기 위해 배열에 4개의 정보를 저장했다.
		String [] ability = {"레벨","공격력","방어력","마법력"};
		
		// 위의 배열 정보를 하나씩 저장하기 위해 반복문을 돌린 것이다.
		// setFaculty가 동작되면서 레벨 : 1, 공격력 : 1, 방어력 : 1, 마법력 : 1 이 저장된다.
		for(String name : ability) {
			setFaculty(name, 1, idx++);
		}
	}

	// 생성자에서 저장된 능력 이름과 수치를 내부 배열에 저장
	// facultyName[] = {"레벨","공격력","방어력","마법력}
	// [] facultyData = {1, 1, 1, 1}
	public void showAbility() {
		String [] showFName = getFacultyName();
		int [] showFData = getFacultyData();
		
		System.out.println("* 능력치");
		// 위에 저장된 내용을 하나씩 화면에 출력
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
