package java06.InheritanceEx03;

/* 
 * Member��ü�� �����ؼ� talkbox�� �����ϰ�
 * recvMember��� ��ü�� ����� talkbox�� �ִ� member��ü�� �����ϸ�
 * recvMember�� ������ member��ü�� ���� ���� ���� �ȴ�.
 */

public class Kakaomain {
	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
		Member member = new Member();
		// ���ο� Member Ŭ���� ��ü ����
		Member recvMember; 
		
		member.setId("�� ���̵�");
		member.setPicture("�⺻�׸�");
		
		// talkbox.setContents("���� ��ħ");
		// talkbox.setChatTime("��ħ�ð�");
		
		talkbox.setMember(member);
		
		// talkbox�� getter�� �ϳ��� ��ü�� ���� ����
		recvMember = talkbox.getMember();
		
		System.out.println(recvMember.getId());
		System.out.println(recvMember.getPicture());
	}
}
