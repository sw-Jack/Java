package java08.Inheritance.Ex03;

// �������̽� ChatSend�� ��ӹ���(implements) ChatNetSendImpl Ŭ����
public class ChatNetSendImpl implements ChatSend {
	// ��� ���� �޼ҵ� ������
	@Override
	public String send() {
		return "��Ʈ��ũ�� ��ȭ ���� ����";
	}
}

