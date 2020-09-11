package java08.Inheritance.Ex03;

public class MainEx01 {
	public static void main(String [] args) {
		// 객체 생성 (형식 주의 *)
	    // [인터페이스] [객체] = new [인터페이스상속클래스] ();
		ChatSend chat = new ChatSendImpl();
		System.out.println(chat.send());
	
		// 이미 선언한 객체 사용 후 재정의 
		chat = new ChatNetSendImpl();
		System.out.println(chat.send());
	}
}
