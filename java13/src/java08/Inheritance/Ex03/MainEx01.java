package java08.Inheritance.Ex03;

public class MainEx01 {
	public static void main(String [] args) {
		// ��ü ���� (���� ���� *)
	    // [�������̽�] [��ü] = new [�������̽����Ŭ����] ();
		ChatSend chat = new ChatSendImpl();
		System.out.println(chat.send());
	
		// �̹� ������ ��ü ��� �� ������ 
		chat = new ChatNetSendImpl();
		System.out.println(chat.send());
	}
}
