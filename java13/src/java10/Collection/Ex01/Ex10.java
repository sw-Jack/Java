package java10.Collection.Ex01;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.ReverbType;

/*
 * ArrayList�� ������ �˻��� ����� ��쿡 �����ϸ�,
 * LinkedList�� �������� ���� ������ ����� ��� �����ϴ�.
 */

public class Ex10 {
	public static void main(String[] args) {
		List<String> lst = new LinkedList<String>();
		String [] words = {"��", "����", "���", "����", "���³�"};
		Random random = new Random();
		
		for(int i=0;i<words.length;i++) {
			int randIdx = random.nextInt(words.length);
			lst.add(words[randIdx]);
		}
		System.out.println("<Before Sorting>");
		for(String word : lst) {
			System.out.println(word);
		}
		System.out.println("\n<After Sorting>");
		lst.sort(null);
		for(String word : lst) {
			System.out.println(word);
		}		
	}
}