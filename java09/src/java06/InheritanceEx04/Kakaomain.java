package java06.InheritanceEx04;

public class Kakaomain {
	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
		
		// Member Ŭ���� ��ü�� �������� �ʰ� 
		// Member Ŭ������ ��� ���� Talkbox Ŭ������ ��ü��
		// �����Ͽ� setter�� ���� �����ϰ� getter ���� ����� �� �ִ�.
		talkbox.setId("�� ���̵�");
		talkbox.setPicture("�⺻ ����");
		talkbox.setContents("���� ��ħ");
		talkbox.setChatTime("��ħ�ð�");
		
		System.out.println(talkbox.getId());
		System.out.println(talkbox.getPicture());
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
	}
}
