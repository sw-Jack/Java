package java06.InheritanceEx07;
import java.util.Random;

/* 
 * 이름
 * 생명력
 * 몸무게
 * 키
 * 별의모래
 * 사탕
 */

public class PocketmonGo extends GameChar {
	private String name;
	
	// 생명력, 몸무게, 키의 배열 위치 정보가 0, 1, 2로
	// 숫자를 적용하면 가독성(쉽게 읽기)이 떨어지므로
	// 각 숫자에 이름을 부여한 것.
	final int HP = 0;
	final int WEIGHT = 1;
	final int HEIGHT = 2;
	// 생성자로, 호출시 내부 내용 설정
	public PocketmonGo() {
		super(5);
		String [] ability = {"생명력","몸무게","키","별의 모래","사탕"};
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
	
	// 강화 메소드
	public void Buildup() {
		/* 
		 * 내부적으로 강화 프로세스 적립
		 * 강화 성공
		 * - hp : 기본값의 3배
		 * - 몸무게 : 기본값의 1.5배
		 * - 키 : 기본값의 2배 
		 */
		// getFacultyData() 메소드를 통해 캐릭터의 수치 데이터를 얻어옴
		// 이후 위의 강화 프로세스에 맞게 코딩
		int [] intData = getFacultyData();
		intData[HP] *= 3;
		intData[WEIGHT] *= 1.5;
		intData[HEIGHT] *= 2;
	}
	
	// 강화 성공, 실패 판단 메소드
	// buildRate는 강화 성공 확률값을 의미
	public void Buildup(int buildRate) {
		// 강화 성공율을 랜덤하게 생성
		Random random = new Random();
		int probability = random.nextInt(100);
		
		// 입력된 강화율보다 랜덤 강화율이 낮으면 강화 성공으로 간주
		if(probability < buildRate)
		{
			System.out.println("\n*** 강화 성공 ***");
			Buildup();
			showAbility();
		}
		else 
		{
			System.out.println("\n*** 강화 실패 ***");
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


