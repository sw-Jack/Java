package java06.InheritanceEx05;

public class Kakaomain {
	public static void main(String[] args) {
		//인수 4개짜리에 해당하는 생성자가 talkbox 안에 존재해야 함(새로 생성해주어야 함)
		Talkbox talkbox = new Talkbox("내아이디","기본 사진","좋은 아침","아침 시간"); 
		
		//talkbox.setId("내 아이디");
        // talkbox.setPicture("기본 사진");
		// talkbox.setContents("좋은 아침");
		// talkbox.setChatTime("아침시간");
		
		System.out.println(talkbox.getId());
		System.out.println(talkbox.getPicture());
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
	}
}





