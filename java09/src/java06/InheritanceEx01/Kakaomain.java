package java06.InheritanceEx01;

/* 
Talkbox 라는 클래스를 생성하고 내부의 contents와 chatTime에는 각각 데이터를 설정했지만
member에는 따로 설정된 데이터가 없기 때문에 
Talkbox.getMember()의 실행 결과가 null이 나오게 되는 것이다.
*/

public class Kakaomain {
	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
		
		talkbox.setContents("좋은 아침");
		talkbox.setChatTime("아침시간");
		
		System.out.println(talkbox.getMember());
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
	}
}
