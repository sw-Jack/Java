package java06.InheritanceEx05;

public class Kakaomain {
	public static void main(String[] args) {
		//�μ� 4��¥���� �ش��ϴ� �����ڰ� talkbox �ȿ� �����ؾ� ��(���� �������־�� ��)
		Talkbox talkbox = new Talkbox("�����̵�","�⺻ ����","���� ��ħ","��ħ �ð�"); 
		
		//talkbox.setId("�� ���̵�");
        // talkbox.setPicture("�⺻ ����");
		// talkbox.setContents("���� ��ħ");
		// talkbox.setChatTime("��ħ�ð�");
		
		System.out.println(talkbox.getId());
		System.out.println(talkbox.getPicture());
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
	}
}





