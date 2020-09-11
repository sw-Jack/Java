package java08.Inheritance.Ex03;

// 인터페이스 ChatSend를 상속받은(implements) ChatNetSendImpl 클래스
public class ChatNetSendImpl implements ChatSend {
	// 상속 받은 메소드 재정의
	@Override
	public String send() {
		return "네트워크로 대화 내용 보냄";
	}
}

